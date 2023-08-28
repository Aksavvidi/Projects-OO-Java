package gr.aueb.cf.ch15.exceprions;

public class InsufficientBalanceException extends Exception {
    private static final long serialVersionUID = 1L; //για να διαχωριζουμε τα διάφορα versions

    public InsufficientBalanceException(){}

    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient balance " + balance + "for amount " + amount );
    }

}
