package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class gcd {
    public static void run() {
        final var description = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i += 1) {
            roundsData[i] = generateRoundData();
        }

        Engine.run(description, roundsData);
    }

    private static String[] generateRoundData() {
        final int maxRandomNumber = 50;
        final int minRandomNumber = 2;
        int firstRandomNumber = Utils.generate(minRandomNumber, maxRandomNumber);
        int secondRandomNumber = Utils.generate(minRandomNumber, maxRandomNumber);

        var question = firstRandomNumber + " " + secondRandomNumber;
        String answer = Integer.toString(gcd(firstRandomNumber, secondRandomNumber));
        return new String[] {question, answer};
    }
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}