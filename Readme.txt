
---

# Guess the Number – Java GUI Project

## Project Overview

**Guess the Number** is a simple and interactive Java-based game developed using **Swing (GUI)**.
In this game, the system generates a random number within a predefined range, and the user attempts to guess the number within a limited number of attempts. After each guess, the system provides feedback indicating whether the guessed number is higher, lower, or equal to the generated number. The game also includes features such as attempt limits, scoring, and multiple rounds.

This project is designed to strengthen understanding of Java fundamentals, logical thinking, and GUI-based user interaction.

---

## Objectives of the Project

* To implement a basic game using Java.
* To understand random number generation.
* To practice conditional statements and loops.
* To learn GUI-based input and output using Java Swing.
* To implement scoring logic based on user performance.
* To enhance problem-solving and logical reasoning skills.

---

## Project Features

* Random number generation between 1 and 100.
* User interaction through Swing dialog boxes.
* Feedback for each guess (Too High / Too Low / Correct).
* Limited number of attempts for each round.
* Score calculation based on remaining attempts.
* Option to play multiple rounds.
* User-friendly graphical interface.

---

## Project Workflow (Step-by-Step)

1. **Game Initialization**

   * When the application starts, the system generates a random number between 1 and 100.
   * The number of attempts is initialized (for example, 10 attempts).

2. **Displaying Instructions**

   * The user is informed about the rules of the game, including the number range and total attempts.

3. **User Input**

   * The user is prompted to enter a guess using a Swing input dialog box.
   * The system reads and stores the entered value.

4. **Comparison Logic**

   * The entered number is compared with the system-generated number.
   * If the guess is lower, a “Too Low” message is displayed.
   * If the guess is higher, a “Too High” message is displayed.
   * If the guess is correct, a success message is shown.

5. **Attempt Tracking**

   * After each incorrect guess, the number of remaining attempts is reduced.
   * The remaining attempts are displayed to the user.

6. **Game Completion**

   * The game ends when the user guesses the correct number or when all attempts are exhausted.

7. **Scoring System**

   * Points are awarded based on the number of remaining attempts.
   * Fewer attempts result in higher points.

8. **Multiple Rounds**

   * After completing a round, the user is given the option to play again.
   * If the user chooses to continue, a new number is generated and the game restarts.
   * If not, the application exits.

---

## Technologies Used

* Programming Language: Java
* GUI Framework: Java Swing
* Development Environment: Any Java-supported IDE (Eclipse, IntelliJ IDEA, NetBeans, VS Code)
* Java Version: JDK 8 or above

---

## Key Java Concepts Used

* Random number generation
* Conditional statements (if-else)
* Loops
* GUI components using Swing
* Event handling
* Variables and state management
* Basic game logic implementation

---

## Advantages of the Project

* Easy to understand and beginner-friendly.
* Improves logical and analytical thinking.
* Demonstrates practical usage of Java Swing.
* Enhances understanding of control flow and user interaction.
* Suitable for academic projects and internships.

---

## Future Enhancements

* Input validation for non-numeric values.
* Difficulty levels (Easy, Medium, Hard).
* Timer-based scoring.
* Improved graphical interface using buttons and panels.
* Maintaining high-score history.

---

## Conclusion

The **Guess the Number** project is a simple yet effective Java GUI application that demonstrates core programming concepts and interactive user interface design. It serves as a strong foundation project for beginners and is suitable for showcasing Java skills during internships and academic evaluations.

