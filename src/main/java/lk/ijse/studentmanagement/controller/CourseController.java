package lk.ijse.studentmanagement.controller;

import lk.ijse.studentmanagement.dto.CourseDto;
import lk.ijse.studentmanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CourseDto> getAllCourses() {
        return courseService.getAllCourses();
    }

//    @PutMapping("/update")
//    public String updateCustomer(@RequestBody CustomerDto customer) {
//        return service.updateCustomer(customer);
//    }

    @GetMapping(value="/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public CourseDto getCourse(@PathVariable("name")String name) {
        return courseService.getCourse(name)  ;
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveCustomer(@RequestBody CourseDto courseDto) {
        return courseService.saveCourse(courseDto);
    }

}
