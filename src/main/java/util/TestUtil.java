package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.lang.String.format;

public class TestUtil {
    private static final Logger log = LoggerFactory.getLogger(TestUtil.class);
    public static final String UNIQUE_CHAR_STR = "abcdefgzxvnm";
    public static final String NON_UNIQUE_CHAR_STR = "aFcdeFgzxvnm";

    public static void executeTaskMultipleTimes(String testLabel, int runCount, Runnable task) {
        long totalTime = 0;
        for (int i = 0; i < runCount; i++) {
            long startNano = System.nanoTime();
            task.run();
            long endNano = System.nanoTime();
            long runtime = endNano - startNano;
            totalTime += runtime;
            log.info(format("%s #%s took %,.3f ms", testLabel, i, runtime / 1_000_000.0));
        }
        log.info(format("%s avg ---------------- %,.3f ms", testLabel, 1.0 * totalTime / runCount / 1_000_000.0));
    }

    public static String generateUniqueCharStringOrdered(int strLen) {
        if (strLen > Character.MAX_VALUE) {
            throw new IllegalArgumentException(format("unique char strLen should be < %s", Character.MAX_VALUE));
        }
        StringBuilder sb = new StringBuilder();
        for (char i = 0; i < strLen; i++) {
            sb.append(i);
        }
        String str = sb.toString();
        log.info(format("generateUniqueCharStringOrdered.length=%,d", str.length()));
        return str;
    }

    public static String generateUniqueCharStringUnordered(int strLen) {
        if (strLen > Character.MAX_VALUE) {
            throw new IllegalArgumentException(format("unique char strLen should be < %s", Character.MAX_VALUE));
        }
        Random random = new Random();
        List<Character> chars = new ArrayList<>();
        for (char i = 0; i < strLen; i++) {
            chars.add(i);
        }
        StringBuilder sb = new StringBuilder();
        while (!chars.isEmpty()) {
            sb.append(chars.remove(random.nextInt(chars.size())));
        }
        String str = sb.toString();
        log.info(format("generateUniqueCharStringUnordered.length=%,d", str.length()));
        return str;
    }

    public static int[] asIntArray(char[] charArray) {
        int[] result = new int[charArray.length];
        Arrays.setAll(result, i -> (int) charArray[i]);
        return result;
    }

}
