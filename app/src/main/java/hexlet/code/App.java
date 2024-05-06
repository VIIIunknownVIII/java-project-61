package hexlet.code;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class App {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit");
        System.out.println("Your choice: ");
        int numberGame = game.nextInt();
        switch (numberGame) {
            case 1:
                Cli.hello();
                break;
            case 0:
                break;
        }
    }
}