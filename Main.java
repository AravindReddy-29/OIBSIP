import javax.swing.*;
import java.util.Random;

class GuessTheNumberGUI {

    static int numberToGuess;
    static int attemptsLeft;
    static int score = 0;

    public static void main(String[] args) {

        startNewGame();
    }

    public static void startNewGame() {

        Random rand = new Random();
        numberToGuess = rand.nextInt(100) + 1;
        attemptsLeft = 10;

        JOptionPane.showMessageDialog(
                null,
                "🎯 Guess the Number Game\n\n" +
                        "I have selected a number between 1 and 100.\n" +
                        "You have 10 attempts to guess it.",
                "Guess The Number",
                JOptionPane.INFORMATION_MESSAGE
        );

        playGame();
    }

    public static void playGame() {

        while (attemptsLeft > 0) {

            String input = JOptionPane.showInputDialog(
                    null,
                    "Enter your guess:\nAttempts left: " + attemptsLeft,
                    "Guess The Number",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Game Cancelled!");
                return;
            }

            int guess;

            try {
                guess = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!");
                continue;
            }

            attemptsLeft--;

            if (guess == numberToGuess) {

                int points = attemptsLeft * 10;
                score += points;

                JOptionPane.showMessageDialog(
                        null,
                        "🎉 Correct!\n" +
                                "You guessed the number.\n" +
                                "Points earned: " + points,
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );

                playAgain();
                return;

            } else if (guess > numberToGuess) {

                JOptionPane.showMessageDialog(null, "Too High! ⬆️");

            } else {

                JOptionPane.showMessageDialog(null, "Too Low! ⬇️");
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "❌ You ran out of attempts!\n" +
                        "The correct number was: " + numberToGuess,
                "Game Over",
                JOptionPane.ERROR_MESSAGE
        );

        playAgain();
    }

    public static void playAgain() {

        int option = JOptionPane.showConfirmDialog(
                null,
                "Your total score: " + score + "\n\nDo you want to play again?",
                "Play Again",
                JOptionPane.YES_NO_OPTION
        );

        if (option == JOptionPane.YES_OPTION) {
            startNewGame();
        } else {
            JOptionPane.showMessageDialog(null, "Thanks for playing! 🎮");
        }
    }
}
