import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String Username = "Admin";
        String Password = "12345";

        System.out.println("Welcome!!");
        
        Scanner myUser = new Scanner(System.in);
        System.out.println("Enter your username:");
        String name = myUser.nextLine();
        
        if (name.equals(Username)) {
            System.out.println("Login Successful!!");
        } else {
            System.out.println("User not found!");
        }

        Scanner myPass = new Scanner(System.in);
        System.out.println("Enter your password:");
        String pass = myPass.nextLine();
        
        if (pass.equals(Password)) {
            System.out.println("Login Successful!!");
        } else {
            System.out.println("User not found!");
        }
    }
}
