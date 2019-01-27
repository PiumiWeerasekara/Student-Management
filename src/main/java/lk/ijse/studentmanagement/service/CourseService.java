package lk.ijse.studentmanagement.service;

import lk.ijse.studentmanagement.dto.CourseDto;

import java.util.ArrayList;

public interface CourseService {
    public ArrayList<CourseDto> getAllCourses();
    public CourseDto getCourse(String coursetId);
    public boolean saveCourse(CourseDto courseDto);
    public String updateCourse(CourseDto courseDto);
}
