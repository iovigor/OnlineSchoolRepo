package utils;

import entities.Student;

public class StudentUtils {
    public Student create(int id){
        Student st = new Student(id);
        return st;
    }
}
