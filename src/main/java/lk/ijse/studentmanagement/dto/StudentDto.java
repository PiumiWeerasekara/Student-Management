package lk.ijse.studentmanagement.dto;

public class StudentDto {
    private String studentID;
    private String studentName;
    private String studentGender;
    private String studentContact;
    private String studentAddress;

    public StudentDto() {
    }

    public StudentDto(String studentID, String studentName, String studentGender, String studentContact, String studentAddress) {
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
        return "StudentDto{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", studentContact='" + studentContact + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
