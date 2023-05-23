package repos;

import entities.Student;

public interface StudentInt {
    void add(Student student);
    Student[] getAll();
    Student getById(int id);
    void deleteById(int id);
    int getIndexById(int id);
}
