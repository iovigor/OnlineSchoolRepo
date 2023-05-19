package repos;

import entities.Homework;

public interface HomeworkInt {
    void add(Homework homework);
    Homework[] getAll();
    Homework getById(int id);
    void deleteById(int id);
    int getIndexById(int id);
}
