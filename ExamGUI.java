import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class ExamGUI {
    private JFrame frame;
    private JLabel timerLabel, questionLabel;
    private JRadioButton[] options;
    private ButtonGroup group;
    private JButton submitButton, nextButton;
    private Timer timer;
    private int timeRemaining = 30; // total exam time in seconds
    private int currentQuestion = 0;

    private ExamManager examManager;

    public ExamGUI() {
        examManager = new ExamManager();
        frame = new JFrame("MCQ Exam");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Timer Label
        timerLabel = new JLabel("Time Remaining: " + timeRemaining + "s");
        timerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(timerLabel, BorderLayout.NORTH);

        // Question Panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,1));
        questionLabel = new JLabel();
        panel.add(questionLabel);

        options = new JRadioButton[4];
        group = new ButtonGroup();
        for (int i=0; i<4; i++) {
            options[i] = new JRadioButton();
            group.add(options[i]);
            panel.add(options[i]);
        }

        frame.add(panel, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        nextButton = new JButton("Next");
        submitButton = new JButton("Submit Exam");
        buttonPanel.add(nextButton);
        buttonPanel.add(submitButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Timer
        timer = new Timer(1000, e -> {
            timeRemaining--;
            timerLabel.setText("Time Remaining: " + timeRemaining + "s");
            if (timeRemaining <= 0) autoSubmit();
        });
        timer.start();

        // Button Actions
        nextButton.addActionListener(e -> nextQuestion());
        submitButton.addActionListener(e -> manualSubmit());

        frame.setVisible(true);

        loadQuestion(currentQuestion);
    }

    private void loadQuestion(int index) {
        Question q = examManager.getQuestions()[index];
        questionLabel.setText("Q" + (index+1) + ": " + q.question);
        for (int i=0; i<4; i++) {
            options[i].setText(q.options[i]);
            options[i].setSelected(false);
        }
    }

    private void nextQuestion() {
        Question q = examManager.getQuestions()[currentQuestion];
        for (int i=0; i<4; i++) {
            if (options[i].isSelected()) {
                q.attempted = true;
                if (i+1 == q.correctAnswer) q.correctAnswer = i+1;
                break;
            }
        }
        currentQuestion++;
        if (currentQuestion >= examManager.getQuestions().length) {
            manualSubmit();
        } else {
            loadQuestion(currentQuestion);
        }
    }

    private void manualSubmit() {
        timer.stop();
        showResult();
    }

    private void autoSubmit() {
        JOptionPane.showMessageDialog(frame, "Time is up! Auto-submitting exam...");
        timer.stop();
        showResult();
    }

    private void showResult() {
        int score = examManager.calculateScore();
        int attempted = examManager.getAttemptedQuestions();
        int unattempted = examManager.getUnattemptedQuestions();

        JOptionPane.showMessageDialog(frame,
                "Exam Completed!\nScore: " + score + "/" + examManager.getTotalQuestions() +
                        "\nAttempted: " + attempted +
                        "\nUnattempted: " + unattempted);

        frame.dispose();
    }
}
