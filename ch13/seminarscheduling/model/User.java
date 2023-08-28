package gr.aueb.cf.ch13.seminarscheduling.model;


public class User {
    private String firstname;
    private String lastname;
    private UserCredentials userCredentials;

    public User() {}

    public User(String firstname, String lastname, UserCredentials userCredentials) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.userCredentials = userCredentials;
    }

    public User(String kathy, String savvi, String s, String kathy1, String s1) {
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

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        this.userCredentials = userCredentials;
    }
}
