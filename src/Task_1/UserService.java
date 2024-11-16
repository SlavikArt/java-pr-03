package Task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserService {
    private static Map<String, String> db = new HashMap<>();
    private static Scanner scn = new Scanner(System.in);

    public static void addUser() {
        System.out.print("Enter login: ");
        String login = scn.nextLine();

        if (db.containsKey(login)) {
            System.out.println("User already exists");
            return;
        }

        System.out.print("Enter password: ");
        String pass = scn.nextLine();

        db.put(login, pass);
        System.out.println("User added successfully");
    }

    public static void removeUser() {
        System.out.print("Enter login to remove: ");
        String login = scn.nextLine();

        if (db.remove(login) != null)
            System.out.println("User removed");
        else
            System.out.println("User not found");
    }

    public static void checkUser() {
        System.out.print("Enter login to check: ");
        String login = scn.nextLine();

        if (db.containsKey(login))
            System.out.println("User exists");
        else
            System.out.println("User not found");
    }

    public static void updateLogin() {
        System.out.print("Enter current login: ");
        String oldLogin = scn.nextLine();

        if (!db.containsKey(oldLogin)) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Enter new login: ");
        String newLogin = scn.nextLine();

        if (db.containsKey(newLogin)) {
            System.out.println("New login already in use (you need to choose another one)");
            return;
        }

        String pass = db.remove(oldLogin);
        db.put(newLogin, pass);
        System.out.println("Login updated successfully");
    }

    public static void updatePassword() {
        System.out.print("Enter login: ");
        String login = scn.nextLine();

        if (!db.containsKey(login)) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Enter new password: ");
        String newPass = scn.nextLine();

        db.put(login, newPass);
        System.out.println("Password updated successfully");
    }
}
