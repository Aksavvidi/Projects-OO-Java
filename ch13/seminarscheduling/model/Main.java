package gr.aueb.cf.ch13.seminarscheduling.model;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία instance της κλάσης User
        User user1 = new User("Kathy", "Savvi", "5", "Kathy", "12345");

        // Δημιουργία instance της κλάσης UserCredentials
        UserCredentials credentials = new UserCredentials(Long.valueOf(23),"john_doe", "secretpassword");
    }
}
