package Task_1;

import java.util.Scanner;

public class UserAuthApp {
    public static void run() {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add new user");
            System.out.println("2. Remove user");
            System.out.println("3. Check if user exists");
            System.out.println("4. Change user login");
            System.out.println("5. Change user password");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            int choice = scn.nextInt();
            scn.nextLine();

            switch (choice) {
                case 1:
                    UserService.addUser();
                    break;
                case 2:
                    UserService.removeUser();
                    break;
                case 3:
                    UserService.checkUser();
                    break;
                case 4:
                    UserService.updateLogin();
                    break;
                case 5:
                    UserService.updatePassword();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, try again");
            }
        }
    }
}
