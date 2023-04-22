package utils;

import entities.Student;
import repos.StudentRepo;

public class StudentUtils {
    public Student create(int id){
        Student st = new Student(id);
        StudentRepo.add(st);
        return st;
    }
}
