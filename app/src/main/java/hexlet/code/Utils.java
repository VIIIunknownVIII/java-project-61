package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generate(int start, int end) {
        Random random = new Random();
        return start + random.nextInt(end - start + 1);
    }
}
