package gr.aueb.cf.ch18.mobilecontacts.dto;

public class UserDetailsDTO {
    private Long usersDetailsId;
    private String firstname;
    private String lastname;

    public UserDetailsDTO() {}

    public Long getUsersDetailsId() {
        return usersDetailsId;
    }
    public void setUsersDetailsId(Long usersDetailsId) {
        this.usersDetailsId = usersDetailsId;
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
}
