package repos;

import entities.Course;

public interface CourseInt {
    void add(Course course);
    Course[] getAll();
    Course getById(int id);
    void deleteById(int id);
    int getIndexById(int id);
}
