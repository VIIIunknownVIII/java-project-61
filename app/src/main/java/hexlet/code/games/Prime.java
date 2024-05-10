package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void run() {
        final int maxRand = 999;
        String[][] quiz = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int num = Utils.generate(0, maxRand);

            quiz[i][0] = String.valueOf(num);
            quiz[i][1] = Prime1(num) ? "yes" : "no";
        }

        String inviteText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.run(inviteText, quiz);
    }

    public static boolean Prime1(int num) {
        boolean Prime1 = num >= 2;

        for (var n = 2; n <= num / 2; n++) {
            if (num % n == 0) {
                Prime1 = false;
                break;
            }
        }

        return Prime1;
    }
}