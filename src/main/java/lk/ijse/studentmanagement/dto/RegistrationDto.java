package lk.ijse.studentmanagement.dto;

public class RegistrationDto {
    private int rid;
    private String regDate;
    private double regFee;
    private int courseId;
    private String studentId;
    private CourseDto courseDto;
    private StudentDto student;

    public RegistrationDto() {
    }

    public RegistrationDto(int rid, String regDate, double regFee, CourseDto courseDto, StudentDto student) {
        this.rid = rid;
        this.regDate = regDate;
        this.regFee = regFee;
        this.courseDto = courseDto;
        this.student = student;
    }

    public RegistrationDto(int rid, String regDate, double regFee, int courseId, String studentId) {
        this.rid = rid;
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

    public CourseDto getCourseDto() {
        return courseDto;
    }

    public void setCourseDto(CourseDto courseDto) {
        this.courseDto = courseDto;
    }

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "RegistrationDto{" +
                "rid=" + rid +
                ", regDate='" + regDate + '\'' +
                ", regFee=" + regFee +
                ", courseId=" + courseId +
                ", studentId='" + studentId + '\'' +
                ", courseDto=" + courseDto +
                ", student=" + student +
                '}';
    }
}
