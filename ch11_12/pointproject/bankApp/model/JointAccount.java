package gr.aueb.cf.ch11_12.pointproject.bankApp.model;


import gr.aueb.cf.ch13.seminarscheduling.model.SeminarRoom;

public class JointAccount {
    private OverdraftAccount firstHolder;
    private OverdraftAccount secondHolder;
    private String iban;
    private double balance;


    public JointAccount() {
    }

    public JointAccount(OverdraftAccount firstHolder, OverdraftAccount secondHolder, String iban, double balance) {
        this.firstHolder = firstHolder;
        this.secondHolder = secondHolder;
        this.iban = iban;
        this.balance = balance;
    }

    public JointAccount(String kate, String john, String iban, int balance) {
    }


    public OverdraftAccount getFirstHolder() {
        return firstHolder;
    }

    public void setFirstHolder(OverdraftAccount firstHolder) {
        this.firstHolder = firstHolder;
    }

    public OverdraftAccount getSecondHolder() {
        return secondHolder;
    }

    public void setSecondHolder(OverdraftAccount secondHolder) {
        this.secondHolder = secondHolder;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws Exception {
            try {
                if (amount >=0) {
                    balance += amount;
                }else {
                    throw new Exception("Negative amount");
                }
            }catch (Exception e) {
                e.printStackTrace();
                throw e;

            }
    }

    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if(!isSsnValid(ssn)) throw new Exception("Not Valid Ssn");
            if(amount <= balance){
                balance -= amount;
            }else {
                balance -= amount;}

        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

   private boolean isSsnValid(String ssn){
       if ((ssn == null) || (firstHolder.getSsn() == null) || (secondHolder.getSsn() == null)) {
           return false;
       }
       return firstHolder.getSsn().equals(ssn) || secondHolder.getSsn().equals(ssn);
   }


   public double getJAccountBalance (){
        return getBalance();
   }
}

