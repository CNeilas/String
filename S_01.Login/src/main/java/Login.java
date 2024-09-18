
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] user1 = new String[] {"alex", "sunshine"};
        String[] user2 = new String[] {"emma", "haskell"};

        System.out.println("Enter username: ");
        String name = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if ((name.equals(user1[0]) && password.equals(user1[1])) || (name.equals(user2[0]) && password.equals(user2[1]))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
