package Models;

import java.util.Date;

public class Student {


    int  studentId;
    String fullname;
    String email;
    String userName;
    String homeAddress;
    String cellNumber;
    String dateOfBirth;
    String dateCreated;
    String dateModified;
    String endDate;

    public Student()
    { }

    public Student(String fullname, String email, String userName, String homeAddress, String cellNumber, String dateOfBirth, String dateCreated, String dateModified, String endDate) {

        this.fullname = fullname;
        this.email = email;
        this.userName = userName;
        this.homeAddress = homeAddress;
        this.cellNumber = cellNumber;
        this.dateOfBirth = dateOfBirth;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }



    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }




}
