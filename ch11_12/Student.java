package gr.aueb.cf.ch11_12;
/**
*Student class definition.
 * POJO class (Plain Old Java Object)
 */

public class Student {
    private int id;
    private String firstname;
    private String lastname;

    public Student(){  //default constructor το  παρεχει η ίδια η Java
//        id = 0;
//        firstname = null;
//        lastname = null;
    }
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
