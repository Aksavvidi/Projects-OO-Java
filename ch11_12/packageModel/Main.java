package gr.aueb.cf.ch11_12.packageModel;

public class Main {
    public static void main(String[] args) {
        User katerina = new User(2, "Katerina", "Savvidi");
        UserCredentials kate = new UserCredentials(5, "Kate13", "K1230");

        System.out.println("ID: " + katerina.getId());
        System.out.println("First Name: " + katerina.getFirstname());
        System.out.println("Last Name: " + katerina.getLastname());

        System.out.println("ID: " + kate.getId());
        System.out.println("Username: " + kate.getUsername());
        System.out.println("Password: " + kate.getPassword());
    }
}
