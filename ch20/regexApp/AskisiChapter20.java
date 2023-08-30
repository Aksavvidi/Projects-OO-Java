package gr.aueb.cf.ch20.regexApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Gets a string containing 8 or more chars and assertr that the strng includes
 * at least one lowercase letter, one uppercase letter, one digit and one special character (#?!@$%^&*-)
 */

public class AskisiChapter20 {

    public static void main(String[] args) {
        String s ="Ak123#78";

        Pattern pattern = Pattern.compile("^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#/?!@/$%/^&/*]).{8,}$");
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
