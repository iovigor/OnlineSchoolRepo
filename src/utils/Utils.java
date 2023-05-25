package utils;

import entities.*;
import org.w3c.dom.ls.LSOutput;
import repos.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            System.out.println("11. test new functions of LectureRepo");
            System.out.println("13. enum testing");
            System.out.println("14. string testing");
            System.out.println("15. generic testing");
            System.out.println("16. oop testing");
            System.out.println("17. exceptions testing");
            System.out.println("18. iterator testing");
            System.out.println("19. list testing");
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
                case 11:
                    testNewFunctionsOfLectureRepo();
                    break;
                case 13:
                    testEnum();
                    break;
                case 14:
                    testString();
                    break;
                case 15:
                    testGeneric();
                    break;
                case 16:
                    testOOP();
                    break;
                case 17:
                    testExceptions();
                    break;
                case 18:
                    testIterator();
                    break;
                case 19:
                    testList();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Incorrect command");
                    }
                    break;
            }
        }
    }

    private void testList(){

        AdditionMaterialRepo addMatRepo = new AdditionMaterialRepo();
        AdditionalMaterialUtils addMatUtils = new AdditionalMaterialUtils();

        AdditionalMaterial addMat1 = addMatUtils.create(1,"add mat 1", 1, ResourceType.BOOK);
        AdditionalMaterial addMat2 = addMatUtils.create(2,"add mat 2", 1, ResourceType.VIDEO);

        System.out.println("Array after adding = "+addMatRepo.getAll().toString());

    }

    private void testIterator() {

        HomeworkUtils hwUtils = new HomeworkUtils();
        Homework hw1 = hwUtils.create(1, "task 1");
        Homework hw2 = hwUtils.create(2, "task 1");
        Homework hw3 = hwUtils.create(3, "task 1");
        Homework hw4 = hwUtils.create(4, "task 1");

        Homework[] homeworks = new Homework[] {hw1, hw2, hw3, hw4};
        SimpleIterator<Homework> simpleIterator = new SimpleIterator(homeworks, 0);

        System.out.println("SimpleIterator after creation:");
        System.out.println(simpleIterator);

        System.out.println("Has next = "+simpleIterator.hasNext());
        System.out.println("Next = "+simpleIterator.next());
        System.out.println("After remove :");
        simpleIterator.remove();
        System.out.println(simpleIterator);
        System.out.println("Find all = "+simpleIterator.findAll().toString());
    }

    private void testExceptions(){

        HomeworkUtils hwUtils = new HomeworkUtils();
        HomeworkRepo homeworkRepo = new HomeworkRepo();

        Homework hw1 = hwUtils.create(1, "task 1");

        System.out.println("Trying to catch the exception - Entity not found");
        homeworkRepo.getById(2);

        System.out.println("Trying to catch the exception with phone - 111@ukr.net");
        validatePhone("111@ukr.net");
    }

    private void testOOP() {

        HomeworkUtils hwUtils = new HomeworkUtils();
        HomeworkRepo homeworkRepo = new HomeworkRepo();
        LectureUtils lecUtils = new LectureUtils();

        Homework hw1 = hwUtils.create(1, "task 1");
        Homework hw2 = hwUtils.create(2, "task 2");
        Homework hw3 = hwUtils.create(3, "task 3");

        Homework[] hwArray = homeworkRepo.getAll();

        System.out.println("Created homeworks with tasks:");
        for (Homework hw:
                hwArray) {
            System.out.println(hw);
        }

        Lecture lec1 = lecUtils.create(1);
        lec1.setHomeworks(hwArray);

        for (Homework hw:
                hwArray) {
            hw.setLectureId(1);
        }

        System.out.println("Lecture after adding homeworks - "+lec1);

        System.out.println("Homeworks after adding to lecture:");
        for (Homework hw:
                hwArray) {
            System.out.println(hw);
        }
    }

    private void testGeneric() {

        System.out.println("It is not working because of next tasks!");

        /*Course[] courses = new Course[1];
        GenericRepo<Course> courseRepo = new GenericRepo(courses);

        Course course1 = new Course(1);
        Course course2 = new Course(2);

        System.out.println("Size = "+courseRepo.size());
        System.out.println("IsEmpty = "+courseRepo.isEmpty());

        courseRepo.add(course1);

        System.out.println("Get index 0 = "+courseRepo.get(0));

        System.out.println("Print after add");
        for (int i = 0; i < courseRepo.size(); i++) {
            System.out.println(courseRepo.get(i));
        }

        courseRepo.add(3, course2);
        System.out.println("Print after added by index 3");
        for (int i = 0; i < courseRepo.size(); i++) {
            System.out.println(courseRepo.get(i));
        }

        courseRepo.remove(3);
        System.out.println("Print after remove by index 3");
        for (int i = 0; i < courseRepo.size(); i++) {
            System.out.println(courseRepo.get(i));
        }*/
    }

    private void testString() {

        PersonUtils personUtils = new PersonUtils();
        LectureUtils lecUtils = new LectureUtils();
        CourseUtils courseUtils = new CourseUtils();

        Course course1 = courseUtils.create(1, "First course");
        System.out.println("Course with name - "+course1);

        Lecture lecture1 = lecUtils.create(1, "First lecture", "Entering lecture");
        System.out.println("Lecture with name - "+lecture1);

        Person person1 = personUtils.create(1, "Taras", "Tarasovich", "38067111111", "test@ukr.net");
        System.out.println("Person with name - "+person1);
    }

    private void testEnum() {

        PersonUtils personUtils = new PersonUtils();
        PersonRepo personRepo = new PersonRepo();
        LectureUtils lecUtils = new LectureUtils();
        LectureRepo lecRepo = new LectureRepo();

        Person student = personUtils.create(1, 1, Role.STUDENT);
        Person teacher = personUtils.create(2, 2, Role.TEACHER);

        System.out.println("Created student - "+student);
        System.out.println("Created teacher - "+teacher);

        int lecId = 1;
        Lecture lec1 = lecUtils.create(lecId, teacher.getCourseId(), teacher.getId());
        System.out.println("Created lecture with teacher - "+lec1);

        System.out.println("Now we are getting lecture by id = "+lecId);
        lecRepo.getById(lecId);

    }

    private void testNewFunctionsOfLectureRepo(){

        LectureUtils lecUtils = new LectureUtils();
        LectureRepo lecRepo = new LectureRepo();

        Lecture lec1 = lecUtils.create(1);
        Lecture lec2 = lecUtils.create(2);
        Lecture lec3 = lecUtils.create(3);
        Lecture lec4 = lecUtils.create(4);
        Lecture lec5 = lecUtils.create(5);

        Lecture[] lectures = lecRepo.getAll();
        System.out.println("Printing result of getAll");
        for (int i = 0; i < lectures.length; i++) {
            System.out.println(lectures[i]);
        }

        System.out.println("Printing result of getById = 2");
        Lecture lecFounded = lecRepo.getById(2);
        System.out.println(lecFounded);

        System.out.println("Printing result of deleteById = 2");
        lecRepo.deleteById(2);
        for (int i = 0; i < lectures.length; i++) {
            System.out.println(lectures[i]);
        }

    }

    private void printIdForElementsOfArray(){
        Lecture[] lectures = LectureRepo.getLectures();
        for (int i = 0; i < lectures.length; i++) {
            Lecture curLect = lectures[i];
            if (curLect != null) {
                int id = curLect.getId();
                System.out.println(""+i+" element of array id is = "+id);
            }
        }
    }

    private void create3LecturesAnd1Course(){

        CourseUtils courseUtils = new CourseUtils();
        Course course1 = courseUtils.create(1);

        LectureUtils lecUtils = new LectureUtils();

        Lecture lec1 = lecUtils.create(1);
        lec1.setCourseId(course1.getId());

        Lecture lec2 = lecUtils.create(2);
        lec2.setCourseId(course1.getId());

        Lecture lec3 = lecUtils.create(3);
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

    public static void validateEmail(String email) {

        if (emailValidator(email)) {
            System.out.println("The email address " + email + " is valid");
        }
        else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("The email address " + email + " is invalid");
            }
        }

    }
    public static void validatePhone(String phone) {

        if (phoneValidator(phone)) {
            System.out.println("The phone " + phone + " is valid");
        }
        else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("The phone " + phone + " is invalid");
            }
        }

    }
    private static final String EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    private static final String PHONE_REGEX = "^[0-9]*$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

    private static boolean emailValidator(String email)
    {
        if (email == null) {
            return false;
        }

        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
    private static boolean phoneValidator(String phone)
    {
        if (phone == null) {
            return false;
        }

        Matcher matcher = PHONE_PATTERN.matcher(phone);
        return matcher.matches();
    }

}
