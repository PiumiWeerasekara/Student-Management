package lk.ijse.studentmanagement.dto;

import java.util.ArrayList;
import java.util.List;

public class CourseDto {
    private int courseID;
    private String courseName;
    private String courseType;
    private String courseDuration;
    private String courseFee;
//    private List<RegistrationDto> registrations = new ArrayList<>();

    public CourseDto() {
    }

    public CourseDto(int courseID, String courseName, String courseType, String courseDuration, String courseFee) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseType = courseType;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }

//    public List<RegistrationDto> getRegistrations() {
//        return registrations;
//    }
//
//    public void setRegistrations(List<RegistrationDto> registrations) {
//        this.registrations = registrations;
//    }


    @Override
    public String toString() {
        return "CourseDto{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", courseType='" + courseType + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", courseFee='" + courseFee + '\'' +
                '}';
    }
}
