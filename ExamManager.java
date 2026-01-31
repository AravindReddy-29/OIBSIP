public class ExamManager {
    private Question[] questions;
    private int score = 0;

    public ExamManager() {
        questions = new Question[] {
            new Question("What is Java?", 
                         new String[]{"OS", "Programming Language", "Browser", "Database"}, 2),
            new Question("Which one is NOT an OOP concept?", 
                         new String[]{"Encapsulation", "Inheritance", "Compilation", "Polymorphism"}, 3)
            // Add more questions
        };
    }

    public Question[] getQuestions() {
        return questions;
    }

    public int calculateScore() {
        score = 0;
        for (Question q : questions) {
            if (q.attempted && q.correctAnswer > 0) score++;
        }
        return score;
    }

    public int getTotalQuestions() { return questions.length; }

    public int getAttemptedQuestions() {
        int count = 0;
        for (Question q : questions) if (q.attempted) count++;
        return count;
    }

    public int getUnattemptedQuestions() {
        return getTotalQuestions() - getAttemptedQuestions();
    }
}
