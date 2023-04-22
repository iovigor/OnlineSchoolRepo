package utils;

import entities.Teacher;
import repos.TeacherRepo;

public class TeacherUtils {
    public Teacher create(int id){
        Teacher teacher = new Teacher(id);
        TeacherRepo.add(teacher);
        return teacher;
    }
}
