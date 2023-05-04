package utils;

import entities.Teacher;
import repos.StudentRepo;
import repos.TeacherRepo;

public class TeacherUtils {
    public Teacher create(int id){
        Teacher teacher = new Teacher(id);
        TeacherRepo teacherRepo = new TeacherRepo();
        teacherRepo.add(teacher);
        return teacher;
    }
}
