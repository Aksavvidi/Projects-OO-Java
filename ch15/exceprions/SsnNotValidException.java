package gr.aueb.cf.ch15.exceprions;

public class SsnNotValidException extends Exception {
    private final static long serialVersionUID = 1L;

    public SsnNotValidException(String ssn){
        super("SSN " + ssn + "is not valid");
    }
}
