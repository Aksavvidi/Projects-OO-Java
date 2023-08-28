package gr.aueb.cf.ch11_12;

public class StudentApp {

    public static void main(String[] args) {
        Student alice = new Student();

        //Set
        alice.setId(1);
        alice.setFirstname ("Alice");
        alice.setLastname("w.");

        //Get
        System.out.println("ID: " + alice.getId());
        System.out.println("Firstname: " +alice.getFirstname());
        System.out.println("Lastname: " +alice.getLastname());
    }
}
