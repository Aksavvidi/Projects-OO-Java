package gr.aueb.cf.ch11_12.pointproject.bankApp.model;

public class OverdraftAccount {

    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    OverdraftAccount () {}

    public OverdraftAccount(int id, String iban, String firstname, String lastname
            , String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws Exception {
        try {
            if(amount >= 0 ) {
                balance += amount;
            }else {
                throw new Exception("Negative amount");
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if(!IsSsnValid(ssn)) throw new Exception("Not Valid Ssn");
            if(amount <= balance){
                balance -= amount;
            }else {
                balance -= amount;}
        }catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }
    public double getODAccountBalance(){
        return getBalance();
    }

    public String getODAccounyState(){
        return "(" + id + ", "+ iban + "," + firstname +","
                +lastname + "," +ssn +"," +"," +balance + ")";
    }

    private boolean IsSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
