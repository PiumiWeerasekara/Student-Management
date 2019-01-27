package lk.ijse.studentmanagement.service;

import lk.ijse.studentmanagement.dto.StudentDto;

import java.util.ArrayList;

public interface StudentService {
    public ArrayList<StudentDto>getAllStudents();
    public StudentDto getStudent(String studentId);
    public boolean deleteStudent(String id);
    public boolean saveStudent(StudentDto studentDto);
    public String updateStudent(StudentDto studentDto);
    public StudentDto searchStudent(String id);

}

