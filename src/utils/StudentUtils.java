package utils;

import entities.Student;
import repos.LectureRepo;
import repos.StudentRepo;

public class StudentUtils {
    public Student create(int id){
        Student st = new Student(id);
        StudentRepo studentRepo = new StudentRepo();
        studentRepo.add(st);
        return st;
    }
}
