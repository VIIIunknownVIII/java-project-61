package hexlet.code;
import java.util.Scanner;
class Cli {
    public static void hello() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = scanner.next();
        System.out.println("Hello, " + user + "!");
    }
}