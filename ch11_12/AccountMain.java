package gr.aueb.cf.ch11_12;

public class AccountMain {

    public static void main(String[] args) {
        Account alice = new Account(1, "gr1234", "Alice", "w.", "R123", 100.5);

        try {
            alice.deposit(1100);
            System.out.println("Successful deposit");

            alice.withdraw(400, "R123");
            System.out.println("Successful withdrawal");

            System.out.println("Alice balance: " + alice.getAccountBalance());
            System.out.println(alice.getAccountState());

            alice.withdraw(200, "R456");
            System.out.println("Successful Withdraw");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
