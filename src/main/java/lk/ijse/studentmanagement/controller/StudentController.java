package lk.ijse.studentmanagement.controller;

import lk.ijse.studentmanagement.dto.StudentDto;
import lk.ijse.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/test")
    public String add() {
        return "add";

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<StudentDto> getAllPayments() {
        return studentService.getAllStudents()    ;
    }

//    @PutMapping("/update")
//    public String updateCustomer(@RequestBody CustomerDto customer) {
//        return service.updateCustomer(customer);
//    }

    @GetMapping(value="/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public StudentDto getStudent(@PathVariable("name")String name) {
        return studentService.getStudent(name)  ;
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveStudent(@RequestBody StudentDto studentDto) {
        return studentService.saveStudent(studentDto);
    }

    @DeleteMapping(value="/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteStudent(@PathVariable("name") String name){
        return studentService.deleteStudent(name);
    }
}
