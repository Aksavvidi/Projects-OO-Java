package gr.aueb.cf.ch20.regexApp;

public class Main {

    public static void main(String[] args) {
        String s = "aksavvidi@gmail.com";
        System.out.println(hasOneUpperLowercaseEndWithIng(s));
        System.out.println(isLetterDigit(s));
        System.out.println(isAnySpaceDigit(s));
        System.out.println(isLetterDigitAnywhere(s));
        System.out.println(isValidEmail(s));
    }

    //If is "Red
    public static boolean isRed(String s) {
        return s.matches("Red");
    }

    //If is "Red" or "Green"
    public static boolean isRedOrGreen(String s) {
        return s.matches("Red|Green");
    }

    //If is "Red" or "red" or "Green" or "green"
    public static boolean isRredOrGgreen(String s) {
        return s.matches("[Rr]ed|[Gg]reen");
    }

    //if Begin with one uppercase-letter and the  ending with "-ing"
    public static boolean hasOneUppercaseEndWithIng(String s) {
        return s.matches("[A-Z]ing");
    }
    //if Begin with one uppercase-letter and the  ending with "-ing"
    public static boolean hasOneUpperLowercaseEndWithIng(String s) {
        return s.matches("[a-zA-Z]ing");
    }

    /*
    * . Οποιοσδήποτε χαρακτήρας
    * ^ Αρχή String
    * $ Τελος String
    * \w Χαρακτήρας λέξης a-zA-Z0-9_
    * \W Οποιοσδήποτε χαρακτήρας εκτός χαρακτήρα λέξης
    * \s whitespace
    * \d Οποιοδήποτε ψηφίο
    * \D Οποιοδήποτε χαρακτήρας εκτός από ψηφίο
     */

    //One space, then digit
    public static boolean isAnySpaceDigit(String s) {
        return s.matches("\\s\\d");
    }
    //One letter, then one Digit
    public static boolean isLetterDigit(String s) {
        return s.matches("\\w\\d");
    }

    //Letter-Digit Anywhere inside a string
    public static boolean isLetterDigitAnywhere(String s) {
        return s.matches(".*\\w\\d.*");
    }

    //Letter-Digit as a hole world
    public static boolean isLetterDigitAsWorld(String s) {
        return s.matches(".*\\d\\w\\d\\b.*");
    }
    /*
    *? μηδέν ή μια εμφάνιση
    * + Μια ή περισσότερες εμφανίσεις
    * * Μηδέν ή περισσότερες φορές
    * {n} η εμφανίσεις ακριβώς
    * {n, m} μεταξύ n και m εμφαωίσεων
    * {n, } Τουλάχιστον n φορες *α{3, }.* τρεις φορες το α(ααα)
    * { ,m} Το πολύ m εμφανίσεις
     */

    //E-mail
    public static boolean isValidEmail(String s) {
        return s.matches("\\w*\\.?\\w*@\\w+\\.(com|gr)");
    }

    //two uppercase letter Dash Seven Digits
    public static boolean isTwoUppercaseLetterDashSevenDigits(String s){
        return s.matches("[A-Z]{2}-\\d{7}");
    }

    //Returns an array of tokens delimited by one or more spaces
    public static String[] getTokens(String s) {
        return s.split("\\s+");
    }

    //Replaces one or more paces with one space
    public static String normalizeStr(String s){
        return s.replaceAll("\\s+", " ");
    }

    //
    public static String mutuallyChange(String s) {
        return s.replaceAll("(.*)\\s+(.*)", "$2 $1");
    }
}
