package repos;

import entities.Teacher;

public interface TeacherInt {
    void add(Teacher teacher);
    Teacher[] getAll();
    Teacher getById(int id);
    void deleteById(int id);
    int getIndexById(int id);
}
