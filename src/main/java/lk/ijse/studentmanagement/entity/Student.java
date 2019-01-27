package lk.ijse.studentmanagement.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "student_id")
    private String studentID;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_gender")
    private String studentGender;

    @Column(name = "student_tel")
    private String studentContact;

    @Column(name = "student_address")
    private String studentAddress;

//    @OneToMany(mappedBy = "student", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
//    private List<Registration> registrations = new ArrayList<>();

    public Student() {

    }

    public Student(String studentID, String studentName, String studentGender, String studentContact, String studentAddres) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentContact = studentContact;
        this.studentAddress = studentAddress;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", studentContact='" + studentContact + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }

}
