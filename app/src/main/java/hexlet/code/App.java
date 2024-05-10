package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class App {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "6 - Prime\n" +
                "0 - Exit\n");
        System.out.println("Your choice: ");
        int number_game = game.nextInt();
        switch (number_game) {
            case 1:
                Cli.hello();
                break;
            case 2:
                Even.run();
            case 3:
                Calc.run();
            case 4:
                GCD.run();
            case 5:
                Progression.run();
            case 6:
                Prime.run();
            case 0:
                break;
            default: throw new RuntimeException("Unknown");
        }
    }
}