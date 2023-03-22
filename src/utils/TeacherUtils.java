package utils;

import entities.Teacher;

public class TeacherUtils {
    public Teacher create(int id){
        Teacher teacher = new Teacher(id);
        return teacher;
    }
}
