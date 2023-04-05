package utils;

import entities.*;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Utils {

    public void createLectures() {
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

        System.out.println("Course Id of lecture 6 = " + lec6.getCourseId());
        System.out.println("Lecture count = " + Lecture.getCount());
    }

    public void setUpConsoleOfCreationByType() {

        CourseUtils courseUtils = new CourseUtils();
        TeacherUtils teacherUtils = new TeacherUtils();
        StudentUtils studentUtils = new StudentUtils();
        LectureUtils lectureUtils = new LectureUtils();
        RandomGenerator random = RandomGenerator.getDefault();

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter type:");
        System.out.println("1. Course");
        System.out.println("2. Teacher");
        System.out.println("3. Student");
        System.out.println("4. Lecture");
        final int type = scanner.nextInt();
        switch (type) {
            case 1:
                Course course = courseUtils.create(random.nextInt(), teacherUtils.create(random.nextInt()),
                        studentUtils.create(random.nextInt()), lectureUtils.create(random.nextInt()));
                System.out.println(course);
                break;
            case 2:
                Teacher teacher = teacherUtils.create(random.nextInt());
                System.out.println(teacher);
                break;
            case 3:
                Student student = studentUtils.create(random.nextInt());
                System.out.println(student);
                break;
            case 4:
                Lecture lecture = lectureUtils.create(random.nextInt());
                System.out.println(lecture);
                break;
            default:
                System.out.println("Incorrect type");
                break;
        }

    }

    public void createLecturesByScanner() {

        int type = 0;
        LectureUtils lectureUtils = new LectureUtils();
        HomeworkUtils hwUtils = new HomeworkUtils();
        AdditionalMaterialUtils addMatUtils = new AdditionalMaterialUtils();
        Scanner scanner = new Scanner(System.in);
        while (type != 2) {

            System.out.println("Please enter type:");
            System.out.println("1. Create new lecture");
            System.out.println("2. Exit");
            type = scanner.nextInt();

            switch (type) {
                case 1:
                    System.out.println("Please input lecture id");
                    int id = scanner.nextInt();
                    System.out.println("Please input course id");
                    int courseId = scanner.nextInt();
                    System.out.println("Please input homework id");
                    int hwId = scanner.nextInt();
                    System.out.println("Please input addition material id");
                    int addMatId = scanner.nextInt();
                    Lecture lecture = new Lecture(id, courseId, hwUtils.create(hwId), addMatUtils.create(addMatId));
                    System.out.println("New lecture = " + lecture);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Incorrect type");
                    break;
            }

        }

        System.out.println("Good bye!");

    }

}
