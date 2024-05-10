package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generate(int StartNabor, int EndNabor) {
        Random random = new Random();
        return StartNabor + random.nextInt(EndNabor - StartNabor + 1);
    }
}