import java.util.Scanner;

public class ProfileManager {

    private Scanner sc;

    public ProfileManager(Scanner sc) {
        this.sc = sc;
    }

    public void updateProfile(User user) {
        System.out.print("Enter new name: ");
        user.setName(sc.nextLine());

        System.out.print("Enter new email: ");
        user.setEmail(sc.nextLine());

        System.out.println("Profile updated successfully.");
    }

    public void changePassword(User user) {
        System.out.print("Enter new password: ");
        user.setPassword(sc.nextLine());

        System.out.println("Password updated successfully.");
    }
}
