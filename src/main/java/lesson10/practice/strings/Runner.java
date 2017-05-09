package lesson10.practice.strings;

/**
 * @author Yurii Malikov
 */
public class Runner {

    public static void main(String[] args) {
        System.out.println(
                "Letters quantity in \"1 ab ,=&2cc\" = " + StringUtils.countLettersIn("1 ab ,=&2cc")

                 + "\n\n\"AsD\".equalsIgnoreCase(new String(\"asD\") : "
                    + "AsD".equalsIgnoreCase(new String("asD"))

                 + "\n\n\"AsD\".toUpperCase = " + "AsD".toUpperCase()
                 + "\n\n\"AsD\".toLowerCase = " + "AsD".toLowerCase()

                 + "\n\n\"dong\" indexes in \"Dong-ding-dong\" ignoring case: "
                    + StringUtils.getSubstringsIndexesInString("dong", "Dong-ding-dong")

                 + "\n\nReplace all \"dong\" with \"bong\" in \"Dong-ding-dong\"  ignoring case: "
                    + StringUtils.replaceAllIgnoreCase("dong", "bong", "Dong-ding-dong")

                 + "\n\nDuplicates in text \"I am an awesome programmer. I am an awesome. I am. I\":"
        );

        StringUtils.getDuplicateQuantitiesIn("I am an awesome programmer. I am an awesome. I am. I")
                .forEach((k, v) -> System.out.println("Word \"" + k + "\" occurs in text " + v + " times"));
    }

}
