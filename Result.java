public class Result {
    public void showResult(int score, int total, int attempted, int unattempted) {
        System.out.println("\n=== Exam Result ===");
        System.out.println("Total Score: " + score + " / " + total);
        System.out.println("Questions Attempted: " + attempted);
        System.out.println("Questions Not Attempted: " + unattempted);
    }
}
