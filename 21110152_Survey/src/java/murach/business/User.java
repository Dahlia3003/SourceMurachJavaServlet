package murach.business;

import java.io.Serializable;
import static java.lang.System.console;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String hearFrom;
    private String receiveAns;
    private String contactBy;
    
    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth = null;
        hearFrom = "";
        receiveAns = "";
        contactBy = null;
    }
    
   public User(String firstName, String lastName, String email, String dateOfBirth, String hearFrom, String receiveAns, String contactBy) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
    this.hearFrom = hearFrom;
    this.receiveAns = receiveAns;
    this.contactBy = contactBy;
    } 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHearFrom() {
        return hearFrom;
    }

    public void setHearFrom(String hearFrom) {
        this.hearFrom = hearFrom;
    }

    public String getReceiveAns() {
        return receiveAns;
    }

    public void setReceiveAns(String receiveAns) {
        this.receiveAns = receiveAns;
    }

    public String getContactBy() {
        return contactBy;
    }

    public void setContactBy(String contactBy) {
        this.contactBy = contactBy;
    }
}