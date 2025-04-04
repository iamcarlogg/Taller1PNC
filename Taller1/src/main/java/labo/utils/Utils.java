package labo.utils;

import java.util.Random;

public class Utils {
    public static String generateTwoLetterCode() {
        Random random = new Random();
        char first = (char) ('A' + random.nextInt(26));
        char second = (char) ('A' + random.nextInt(26));
        return "" + first + second;
    }
}
