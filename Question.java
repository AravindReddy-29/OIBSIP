public class Question {
    public String question;
    public String[] options;
    public int correctAnswer; // 1-4
    public boolean attempted = false;

    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}
