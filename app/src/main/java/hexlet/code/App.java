package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;



public class App {
    public static final int GREAT = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static final int EXIT = 0;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("""
        1 - Great
        2 - Even
        3 - Calc
        4 - GCD
        5 - Progression
        6 - Prime
        0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice " + userChoice);

        switch (userChoice) {
            case GREAT:
                Cli.hello();
                break;
            case EVEN:
                Even.run();
                break;
            case CALC:
                Calc.run();
                break;
            case GCD:
                Gcd.run();
                break;
            case PROGRESSION:
                Progression.run();
                break;
            case PRIME:
                Prime.run();
                break;
            case EXIT:
                break;
            default: System.out.println("Unknown command: " + userChoice + ". Bye!");
        }
        scanner.close();
    }
}