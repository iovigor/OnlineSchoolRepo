package repos;

import entities.AdditionalMaterial;
import entities.Course;

import java.util.Arrays;

public class CourseRepo {

    public static Course[] courses;

    public static void add(Course course) {

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
}