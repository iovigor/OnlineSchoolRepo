package repos;

import entities.Lecture;

public interface LectureInt {
    void add(Lecture lecture);
    Lecture[] getAll();
    Lecture getById(int id);
    void deleteById(int id);
    int getIndexById(int id);
}
