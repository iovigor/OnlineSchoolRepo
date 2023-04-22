package repos;

import entities.Student;
import entities.Teacher;

import java.util.Arrays;

public class TeacherRepo{

    public static Teacher[] teachers;
    public static void add(Teacher teacher) {

        int curindex = 0;
        if (teachers == null) {
            teachers = new Teacher[1];
        } else {
            curindex = teachers.length - 1;
            int newLength = teachers.length * 3 / 2 + 1;
            teachers = Arrays.copyOf(teachers, newLength);
        }
        teachers[curindex] = teacher;

    }
}