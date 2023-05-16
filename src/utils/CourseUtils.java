package utils;

import entities.*;
import repos.AdditionMaterialRepo;
import repos.CourseRepo;
import repos.GenericRepo;
import repos.HomeworkRepo;

public class CourseUtils {
    public Course create(int id){
        Course course = new Course(id);
        CourseRepo coursesRepo = new CourseRepo();
        coursesRepo.add(course);
        return course;
    }
    public Course create(int id, String name) {
        Course course = new Course(id, name);
        CourseRepo coursesRepo = new CourseRepo();
        coursesRepo.add(course);
        return course;
    }
    public Course create(int id, Teacher teacher, Student student, Lecture lecture) {
        Course course = new Course(id, teacher, student, lecture);
        CourseRepo coursesRepo = new CourseRepo();
        coursesRepo.add(course);
        return course;
    }

}
