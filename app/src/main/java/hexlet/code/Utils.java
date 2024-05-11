package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generate(int Strt, int Ed) {
        Random random = new Random();
        return Strt + random.nextInt(Ed - Strt + 1);
    }
}