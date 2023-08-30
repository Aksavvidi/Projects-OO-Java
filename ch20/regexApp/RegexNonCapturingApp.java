package gr.aueb.cf.ch20.regexApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNonCapturingApp {
    public static void main(String[] args) {
        String s = "HelloCF HelloCFCF";

        //Non-capturing group
        Pattern pattern = Pattern.compile("(Hello)(?:CF)+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println(matcher.group(i) + " ");
            }
            System.out.println();
        }

    }
}
