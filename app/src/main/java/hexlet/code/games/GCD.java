package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void run() {
        final int maxRand = 99;
        String[][] quizz = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int firstNum = Utils.generate(0, maxRand);
            int secondNum = Utils.generate(1, maxRand);
            int gcd = gcd(firstNum, secondNum);
            quizz[i][0] = firstNum + " " + secondNum;
            quizz[i][1] = String.valueOf(gcd);
        }

        String inviteText = "Find the greatest common divisor of given numbers.";
        Engine.run(inviteText, quizz);
    }

    private static int gcd(int a, int b) {
        return (a % b == 0) ? b : gcd(b, a % b);
    }
}