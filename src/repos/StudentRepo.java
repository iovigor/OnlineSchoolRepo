package repos;

import entities.Lecture;
import entities.Student;

import java.util.Arrays;

public class StudentRepo implements StudentInt {

    private static Student[] students;

    @Override
    public void add(Student student) {

        int curindex = 0;
        if (students == null) {
            students = new Student[1];
        } else {
            curindex = students.length;
            int newLength = students.length + 1;
            students = Arrays.copyOf(students, newLength);
        }
        students[curindex] = student;

    }

    public static Student[] getStudents() {
        return students;
    }

    @Override
    public Student[] getAll() {
        return students;
    }

    @Override
    public Student getById(int id) {
        Student student = null;
        int i = getIndexById(id);
        if (i != -1) {
            student = students[i];
        }
        return student;
    }

    @Override
    public void deleteById(int id) {

        int i = getIndexById(id);
        if (i != -1) {
            students[i] = null;
        }

    }

    @Override
    public int getIndexById(int id) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }
}