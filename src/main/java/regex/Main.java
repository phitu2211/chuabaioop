package regex;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "\\d*[13579]";
        String str = "12345";

        boolean result = Pattern.matches(regex, str);
        System.out.println(result);
    }
}
