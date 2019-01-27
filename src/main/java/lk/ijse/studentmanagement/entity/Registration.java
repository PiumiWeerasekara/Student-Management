package lk.ijse.studentmanagement.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rid")
    private int rid;

    @Column(name = "r_date")
    private String regDate;

    @Column(name = "r_fee")
    private double regFee;

    @Column(name = "course_id")
    private int courseId;

    @Column(name = "student_id")
    private String studentId;

    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id",referencedColumnName = "course_id" , insertable = false, updatable = false)
    private Course course;

    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id",referencedColumnName = "student_id" ,  insertable = false, updatable = false)
    private Student student;


    public Registration() {

    }

    public Registration(String regDate, double regFee, Course course, Student student) {
        this.regDate = regDate;
        this.regFee = regFee;
        this.course = course;
        this.student = student;
    }

    public Registration(String regDate, double regFee, int courseId, String studentId) {
        this.regDate = regDate;
        this.regFee = regFee;
        this.courseId = courseId;
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public double getRegFee() {
        return regFee;
    }

    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "rid=" + rid +
                ", regDate='" + regDate + '\'' +
                ", regFee=" + regFee +
                ", courseId=" + courseId +
                ", studentId='" + studentId + '\'' +
                ", course=" + course +
                ", student=" + student +
                '}';
    }
}

