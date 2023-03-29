
import entities.*;
import utils.*;

public class Main {
    public static void main(String[] args) {

        LectureUtils LecUtils = new LectureUtils();
        CourseUtils CourseUtils = new CourseUtils();

        Course course1 = CourseUtils.create(1);

        Lecture lec1 = LecUtils.create(1);
        lec1.setCourseId(course1.getId());

        Lecture lec2 = LecUtils.create(2);
        lec2.setCourseId(course1.getId());

        Lecture lec3 = LecUtils.create(3);
        lec3.setCourseId(course1.getId());

        Lecture lec4 = LecUtils.create(4);
        lec4.setCourseId(course1.getId());

        Lecture lec5 = LecUtils.create(5);
        lec5.setCourseId(course1.getId());

        Lecture lec6 = LecUtils.create(6);
        lec6.setCourseId(course1.getId());

        System.out.println("Course Id of lection 6 = "+lec6.getCourseId());
        System.out.println("Lecture count = "+Lecture.getCount());

    }
}