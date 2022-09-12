package tmp.practice.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Yurii Malikov
 */
public class StringUtils {

    public static long countLettersIn(String string) {
        return string.chars()
                .filter(Character::isLetter)
                .count();
    }

    public static List<Integer> getSubstringsIndexesInString(String substring, String string) {
        List<Integer> indexes = new ArrayList<>();

        Matcher matcher = Pattern.compile(substring).matcher(string.toLowerCase());
        while (matcher.find()) {
            indexes.addAll(IntStream.range(matcher.start(), matcher.end())
                    .boxed()
                    .collect(Collectors.toList()));
        }

        return indexes;
    }

    public static String replaceAllIgnoreCase(String oldSubstring, String newSubstring, String text) {
        return text.replaceAll("(?i)" + Pattern.quote(oldSubstring), newSubstring);
    }

    public static Map<String, Integer> getDuplicateQuantitiesIn(String text) {
        return Stream.of(text.split("\\W+"))
                .collect(Collectors.toMap(
                        String::toString,
                        (s) -> 1,
                        Integer::sum))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() != 1)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue));
    }

}
