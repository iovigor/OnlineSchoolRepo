package repos;

import entities.Course;

import java.util.Arrays;

public class CourseRepo extends EntityRepo {

    private static Course[] courses;

    @Override
    public void add(Course course) {

        int curindex = 0;
        if (courses == null) {
            courses = new Course[1];
        } else {
            curindex = courses.length - 1;
            int newLength = courses.length * 3 / 2 + 1;
            courses = Arrays.copyOf(courses, newLength);
        }
        courses[curindex] = course;

    }

    public static Course[] getCourses() {
        return courses;
    }

    @Override
    public Course[] getAll() {
        return courses;
    }

    @Override
    public Course getById(int id) {
        Course course = null;
        int i = getIndexById(id);
        if (i != -1) {
            course = courses[i];
        }
        return course;
    }

    @Override
    public void deleteById(int id) {

        int i = getIndexById(id);
        if (i != -1) {
            courses[i] = null;
        }

    }

    @Override
    protected int getIndexById(int id) {
        int index = -1;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null && courses[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }
}