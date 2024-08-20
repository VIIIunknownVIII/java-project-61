package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void run() {
        final int maxRand = 101;
        String[][] quizzes = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int currentNum = Utils.generate(0, maxRand);
            quizzes[i][0] = String.valueOf(currentNum);
            quizzes[i][1] = isEven(currentNum) ? "yes" : "no";
        }

        String inviteText = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.run(inviteText, quizzes);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
