package lesson10.practice.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Yurii Malikov
 */
public class StringUtils {

    public static int countLettersIn(String string) {
        int letterCounter = 0;

        for (char character : string.toCharArray()) {
            if (Character.isLetter(character)) {
                letterCounter++;
            }
        }

        return letterCounter;
//        return string.length() - string.replaceAll("[a-zA-Z]", "").length();
//        return (int) string.chars().mapToObj(i -> (char) i).filter(Character::isLetter).count();
    }

    public static List<Integer> getSubstringsIndexesInString(String substring, String string) {
        List<Integer> indexes = new ArrayList<>();

        Matcher matcher = Pattern.compile(substring).matcher(string.toLowerCase());
        while (matcher.find()){
            indexes.addAll(IntStream.range(matcher.start(), matcher.end()).boxed().collect(Collectors.toList()));
        }

        return indexes;
    }

    public static String replaceAllIgnoreCase(String oldSubstring, String newSubstring, String text) {
        return text.replaceAll("(?i)" + Pattern.quote(oldSubstring), newSubstring);
    }

    public static Map<String, Integer> getDuplicateQuantitiesIn(String text) {
        // TODO: 5/5/2017 rename map
        Map<String, Integer> map = new HashMap<>();

        for (String word : text.split("\\W+")){
            map.put(word, map.containsKey(word) ? map.get(word) + 1 : 1);
        }

        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() != 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

}
