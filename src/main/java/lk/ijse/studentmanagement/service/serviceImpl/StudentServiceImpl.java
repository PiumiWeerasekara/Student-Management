package lk.ijse.studentmanagement.service.serviceImpl;

import lk.ijse.studentmanagement.dto.StudentDto;
import lk.ijse.studentmanagement.entity.Student;
import lk.ijse.studentmanagement.repository.StudentRepository;
import lk.ijse.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public ArrayList<StudentDto> getAllStudents() {

        List<Student> all=studentRepository.findAll();
        ArrayList<StudentDto> alStudents=new ArrayList<>();
        for (Student student : all) {
            StudentDto studentDto=new StudentDto(
                    student.getStudentID(),
                    student.getStudentName(),
                    student.getStudentGender(),
                    student.getStudentContact(),
                    student.getStudentAddress());
            alStudents.add(studentDto);
        }
        return alStudents;
    }

    @Override
    public StudentDto getStudent(String studentId) {

        Student student=studentRepository.findById(studentId).get();
        StudentDto studentDto=new StudentDto(student.getStudentID(),student.getStudentName(),student.getStudentGender(),student.getStudentContact(),student.getStudentAddress());
        return studentDto;

    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public boolean deleteStudent(String id) {
        studentRepository.deleteById(id);
        return true;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public boolean saveStudent(StudentDto studentDto) {
        Student s=new Student();
        s.setStudentID(studentDto.getStudentID());
        s.setStudentName(studentDto.getStudentName());
        s.setStudentGender(studentDto.getStudentGender());
        s.setStudentContact(studentDto.getStudentContact());
        s.setStudentAddress(studentDto.getStudentAddress());
        studentRepository.save(s);
        return true;

    }

    @Override
    public String updateStudent(StudentDto studentDto) {
        return null;
    }

    @Override
    public StudentDto searchStudent(String id) {
        return null;
    }
}
