package utils;

import entities.*;
import repos.CourseRepo;

public class CourseUtils {
    public Course create(int id){
        Course course = new Course(id);
        CourseRepo.add(course);
        return course;
    }
    public Course create(int id, Teacher teacher, Student student, Lecture lecture) {
        Course course = new Course(id, teacher, student, lecture);
        CourseRepo.add(course);
        return course;
    }
}
