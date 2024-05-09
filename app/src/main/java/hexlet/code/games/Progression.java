package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void run() {
        final int maxRand = 999;
        final int minProgress = 5;
        final int maxProgress = 10;
        final int minStepVal = 2;
        final int maxStepVal = 9;
        String[][] quizzes = new String[Engine.ROUNDS][2];

        for (var i = 0; i < Engine.ROUNDS; i++) {
            int len = Utils.generate(minProgress, maxProgress);
            int initNum = Utils.generate(0, maxRand);
            int step = Utils.generate(minStepVal, maxStepVal);
            int questNumIndex = Utils.generate(0, len - 1);

            String[] progression = getProgressionStringArr(len, initNum, step);
            String answer = progression[questNumIndex];
            progression[questNumIndex] = "..";
            quizzes[i][0] = String.join(" ", progression);
            quizzes[i][1] = answer;
        }

        String inviteText = "What number is missing in the progression?";
        Engine.runGame(inviteText, quizzes);
    }

    private static String[] getProgressionStringArr(int len, int initNum, int step) {
        String[] progression = new String[len];

        for (var i = 0; i < len; i++) {
            progression[i] = String.valueOf(initNum + i * step);
        }

        return progression;
    }
}