package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generate(int Start, int End) {
        Random random = new Random();
        return Start + random.nextInt(End - Start + 1);
    }
}