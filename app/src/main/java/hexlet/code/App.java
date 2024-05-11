package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Prme;
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
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Your choice " + userChoice);

        switch (userChoice) {
            case GREAT:
                Cli.greet();
                break;
            case EVEN:
                Even.run();
                break;
            case CALC:
                Calc.run();
                break;
            case GCD:
                hexlet.code.games.GCD.run();
                break;
            case PROGRESSION:
                Progression.run();
                break;
            case PRIME:
                Prme.run();
                break;
            case EXIT:
                break;
            default: System.out.println("Unknown command: " + userChoice + ". Bye!");
        }
        scanner.close();
    }
}
