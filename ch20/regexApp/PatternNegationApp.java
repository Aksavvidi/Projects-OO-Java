package gr.aueb.cf.ch20.regexApp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternNegationApp {

    public static void main(String[] args) {
        String s = "B!@@:K555:D12!:";

        //Negation
        //Pattern pattern = Pattern.compile("[A-Z&&[^ADX]].*?:");

        //Intersect
        //Pattern pattern = Pattern.compile("[A-Z&&[ADX]].*?:");

        //Union
        Pattern pattern = Pattern.compile("[A-D[M-P]].*?:");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
