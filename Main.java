import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // ✅ ONLY scanner

        User user = new User("admin", "1234", "Aravind", "aravind@gmail.com");

        LoginManager loginManager = new LoginManager(user, sc);
        ProfileManager profileManager = new ProfileManager(sc);

        if (!loginManager.login()) {
            System.out.println("Exiting program...");
            return;
        }

        while (true) {
            System.out.println("\n1. Update Profile");
            System.out.println("2. Change Password");
            System.out.println("3. Start Exam");
            System.out.println("4. Logout");
            System.out.print("Choose option: ");

            String input = sc.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number (1–4).");
                continue;
            }

            switch (choice) {
                case 1:
                    profileManager.updateProfile(user);
                    break;

                case 2:
                    profileManager.changePassword(user);
                    break;

                case 3:
                    System.out.println("Launching Exam...");
                    javax.swing.SwingUtilities.invokeLater(ExamGUI::new);
                    break;

                case 4:
                    System.out.println("Logged out successfully.");
                    sc.close(); // ✅ close only once, at the end
                    return;

                default:
                    System.out.println("Choose between 1 and 4.");
            }
        }
    }
}
