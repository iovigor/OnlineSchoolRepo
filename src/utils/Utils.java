package utils;

import entities.*;
import repos.LectureRepo;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Utils {

    public void setUpMenu() {

        final Scanner scanner = new Scanner(System.in);
        int command = 1;

        while (command!=0) {
            System.out.println("Please enter command:");
            System.out.println("7. create lectures");
            System.out.println("81. create objects by console");
            System.out.println("82. create lectures by scanner");
            System.out.println("91. choosing numbers from number range");
            System.out.println("92. create 8 lectures and exit");
            System.out.println("101. create 3 lectures and 1 course");
            System.out.println("102. print id for elements of lectures array");
            System.out.println("0. Exit");
            command = scanner.nextInt();
            switch (command) {
                case 7:
                    createLectures();
                    break;
                case 81:
                    setUpConsoleOfCreationByType();
                    break;
                case 82:
                    createLecturesByScanner();
                    break;
                case 91:
                    choosenumbers();
                    break;
                case 92:
                    createLecturesAndExit();
                    break;
                case 101:
                    create3LecturesAnd1Course();
                    break;
                case 102:
                    printIdForElementsOfArray();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect command");
                    break;
            }
        }
    }

    private void printIdForElementsOfArray(){
        Lecture[] lectures = LectureRepo.lectures;
        for (int i = 0; i < lectures.length; i++) {
            Lecture curLect = lectures[i];
            if (curLect != null) {
                int id = curLect.getId();
                System.out.println(""+i+" element of array id is = "+id);
            }
        }
    }

    private void create3LecturesAnd1Course(){

        CourseUtils CourseUtils = new CourseUtils();
        Course course1 = CourseUtils.create(1);

        LectureUtils LecUtils = new LectureUtils();

        Lecture lec1 = LecUtils.create(1);
        lec1.setCourseId(course1.getId());

        Lecture lec2 = LecUtils.create(2);
        lec2.setCourseId(course1.getId());

        Lecture lec3 = LecUtils.create(3);
        lec3.setCourseId(course1.getId());

        System.out.println("Courses created = "+Course.getCount());
        System.out.println("Lectures created = "+Lecture.getCount());
    }

    private void createLecturesAndExit(){
        LectureUtils LecUtils = new LectureUtils();
        Lecture lec1 = LecUtils.create(1);
        Lecture lec2 = LecUtils.create(2);
        Lecture lec3 = LecUtils.create(3);
        Lecture lec4 = LecUtils.create(4);
        Lecture lec5 = LecUtils.create(5);
        Lecture lec6 = LecUtils.create(6);
        Lecture lec7 = LecUtils.create(7);
        Lecture lec8 = LecUtils.create(8);
        System.out.println("Number of lections created = "+Lecture.getCount());
        System.exit(0);
    }

    private void choosenumbers() {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Please input start number...");
        final int startNumber = scanner.nextInt();

        System.out.println("Please input end number...");
        final int endNumber = scanner.nextInt();

        boolean correct = true;
        while (correct) {
            System.out.println("Please input number from " + startNumber + " to " + endNumber);
            System.out.println("If not in range, then exit.");
            final int curNumber = scanner.nextInt();
            correct = (curNumber >= startNumber) && (curNumber <= endNumber);
        }
    }

    private void createLectures() {
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

    private void setUpConsoleOfCreationByType() {

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

    private void createLecturesByScanner() {

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
