package utils;

import entities.*;

public class CourseUtils {
    public Course create(int id){
        Course course = new Course(id);
        return course;
    }
    public Course create(int id, Teacher teacher, Student student, Lecture lecture) {
        Course course = new Course(id, teacher, student, lecture);
        return course;
    }
}
