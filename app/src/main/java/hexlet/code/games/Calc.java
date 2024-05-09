package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void run() {
        final int maxRand = 999;
        final char[] operators = new char[]{'+', '-', '*','/'};
        String[][] quizzes = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            char znak = operators[Utils.generate(0, operators.length - 1)];
            int firstNum = Utils.generate(0, maxRand);
            int secondNum = Utils.generate(0, maxRand);
            int result = calcNumbersByznak(firstNum, secondNum, znak);

            quizzes[i][0] = firstNum + " " + znak + " " + secondNum;
            quizzes[i][1] = String.valueOf(result);
        }

        String inviteText = "What is the result of the expression?";
        Engine.runGame(inviteText, quizzes);
    }

    private static int calcNumbersByznak(int firstNum, int secondNum, char znak) {
        switch (znak) {
            case '+':
                return firstNum + secondNum;
            case '-':
                return firstNum - secondNum;
            case '*':
                return firstNum * secondNum;
            case '/':
                return firstNum / secondNum;
            default:
                throw new RuntimeException("Unknown operator: " + znak);
        }
    }
}