package gr.aueb.cf.ch20.regexApp;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// gets as input a string containing any chars
// and asserts that the string includes at least
// on lowercase letter.
public class LowercaseValidationApp {

    public static void main(String[] args) {
        String s = "a123A5*7";


        //Pattern pattern =Pattern.compile("^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9]).{8,}$");
        Pattern pattern =Pattern.compile("^(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#/?!@/$%/^&/*]).{8,}$");
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
