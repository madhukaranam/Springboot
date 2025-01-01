package com.demo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtil {

    public static int countOccurrences(String text, String word) {
        // Create a regular expression to match the word
        String regex = "\\b" + Pattern.quote(word) + "\\b"; // \b is word boundary
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
