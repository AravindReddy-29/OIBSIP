import java.util.Scanner;

public class LoginManager {

    private User user;
    private Scanner sc;

    public LoginManager(User user, Scanner sc) {
        this.user = user;
        this.sc = sc;
    }

    public boolean login() {
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (user.getUsername().equals(username)
                && user.getPassword().equals(password)) {
            System.out.println("Login Successful");
            return true;
        } else {
            System.out.println("Invalid Credentials");
            return false;
        }
    }
}
