package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void run() {
        final int maxRand = 20;
        String[][] quiz = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int num = Utils.generate(0, maxRand);

            quiz[i][0] = String.valueOf(num);
            quiz[i][1] =  isPrimes(num) ? "yes" : "no";
        }

        String inviteText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.run(inviteText, quiz);
    }

    public static boolean isPrimes(int num) {
        if (num < 2) {
            return false;
        }
        boolean isPrimes = true;

        for (int n = 2; n <= Math.sqrt(num); n++) {
            if (num % n == 0) {
                isPrimes = false;
                break;
            }
        }
        return isPrimes;
    }
}
