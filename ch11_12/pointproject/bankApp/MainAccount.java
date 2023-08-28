package gr.aueb.cf.ch11_12.pointproject.bankApp;

import gr.aueb.cf.ch11_12.pointproject.bankApp.model.JointAccount;
import gr.aueb.cf.ch11_12.pointproject.bankApp.model.OverdraftAccount;

public class MainAccount {

    public static void main(String[] args) {
        OverdraftAccount kate = new OverdraftAccount(2, "gr123", "Kate", "Smith", "13456", 800 );
        OverdraftAccount john = new OverdraftAccount(5, "gr123", "John", "w.", "65431", 800);
      JointAccount kateJohn = new JointAccount( "kate", "john", "45612", 1000);
        try {
            kate.deposit(200);
            System.out.println("Successful deposit ");
            kate.withdraw(500, "13456");
            System.out.println("Successful withdrawal");
            kate.withdraw(550,"13456");
            System.out.println("Successful withdrawal");
            kateJohn.withdraw(800, "john");
            System.out.println("Successful withdrawal ");



        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
  }



}
