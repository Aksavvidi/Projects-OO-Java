package gr.aueb.cf.ch20.regexApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyPatternApp {

    public static void main(String[] args) {
        String s = "login:thanos;pass:12345;";
        //Greedy match
        //Pattern pattern = Pattern.compile(".*;");

        //Reluctant match
        Pattern pattern = Pattern.compile(".*?;");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }
    }
}
