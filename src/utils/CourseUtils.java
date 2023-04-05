package utils;

import entities.Course;

public class CourseUtils {
    public Course create(int id){
        Course course = new Course(id);
        return course;
    }
}
