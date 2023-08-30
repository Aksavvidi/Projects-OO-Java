package gr.aueb.cf.ch20;

public class Teacher {
    private int teacherId;
    private String firstname;
    private String lastname;

    private Teacher() {}

    public Teacher(int teacherId, String firstname, String lastname) {
        this.teacherId = teacherId;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public void printFullName(){
        System.out.println("ID: " + teacherId + " Firstname: "
                + firstname + " Lastname: " + lastname);
    }
    public static void  printTeacher(Teacher teacher){

    }

}
