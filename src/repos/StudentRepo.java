package repos;

import entities.Lecture;
import entities.Student;

import java.util.Arrays;

public class StudentRepo{

    public static Student[] students;

    public static void add(Student student) {

        int curindex = 0;
        if (students == null) {
            students = new Student[1];
        } else {
            curindex = students.length - 1;
            int newLength = students.length * 3 / 2 + 1;
            students = Arrays.copyOf(students, newLength);
        }
        students[curindex] = student;

    }
}