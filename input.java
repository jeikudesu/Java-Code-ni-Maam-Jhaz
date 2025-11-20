import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myName = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = myName.nextLine();
        System.out.println(name);

        Scanner myQuote = new Scanner(System.in);
        System.out.print("Enter your quote: ");
        String quote = myQuote.nextLine();
        System.out.println(quote);
    }
}
