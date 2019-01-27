package lk.ijse.studentmanagement.service.serviceImpl;

import lk.ijse.studentmanagement.dto.CourseDto;
import lk.ijse.studentmanagement.entity.Course;
import lk.ijse.studentmanagement.repository.CourseRepository;
import lk.ijse.studentmanagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public ArrayList<CourseDto> getAllCourses() {
        List<Course> all=courseRepository.findAll();
        ArrayList<CourseDto> alCourses=new ArrayList<>();
        for (Course course : all) {
            CourseDto courseDto=new CourseDto(
                    course.getCourseID(),
                    course.getCourseName(),
                    course.getCourseType(),
                    course.getCourseDuration(),
                    course.getCourseFee());
            alCourses.add(courseDto);
        }
        return alCourses;
    }

    @Override
    public CourseDto getCourse(String coursetId) {

        Course course=courseRepository.findById(coursetId).get();
        CourseDto courseDto=new CourseDto(course.getCourseID(),course.getCourseName(),course.getCourseType(),course.getCourseDuration(),course.getCourseFee());
        return courseDto;
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public boolean saveCourse(CourseDto courseDto) {
        Course c=new Course();
        c.setCourseID(courseDto.getCourseID());
        c.setCourseName(courseDto.getCourseName());
        c.setCourseType(courseDto.getCourseType());
        c.setCourseDuration(courseDto.getCourseDuration());
        c.setCourseFee(courseDto.getCourseFee());
        courseRepository.save(c);
        return true;
    }

    @Override
    public String updateCourse(CourseDto courseDto) {
        return null;
    }
}
