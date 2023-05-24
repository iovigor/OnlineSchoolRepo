package repos;

import entities.EntityNotFoundException;
import entities.Teacher;

import java.util.Arrays;

public class TeacherRepo implements TeacherInt {

    private static Teacher[] teachers;

    @Override
    public void add(Teacher teacher) {

        int curindex = 0;
        if (teachers == null) {
            teachers = new Teacher[1];
        } else {
            curindex = teachers.length;
            int newLength = teachers.length + 1;
            teachers = Arrays.copyOf(teachers, newLength);
        }
        teachers[curindex] = teacher;

    }

    public static Teacher[] getTeachers() {
        return teachers;
    }

    @Override
    public Teacher[] getAll() {
        return teachers;
    }

    @Override
    public Teacher getById(int id) {
        Teacher teacher = null;
        int i = getIndexById(id);
        if (i != -1) {
            teacher = teachers[i];
        }
        if (teacher == null) {
            try {
                throw new EntityNotFoundException();
            } catch (EntityNotFoundException e) {
                System.out.println(e.getMessage());;
            }
        }
        return teacher;
    }

    @Override
    public void deleteById(int id) {

        int i = getIndexById(id);
        if (i != -1) {
            teachers[i] = null;
        }

    }

    @Override
    public int getIndexById(int id) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }
}