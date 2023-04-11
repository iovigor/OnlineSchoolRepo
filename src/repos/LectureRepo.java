package repos;

import entities.Homework;
import entities.Lecture;

import java.util.Arrays;

public class LectureRepo{

    public static Lecture[] lectures;

    public static void add(Lecture lecture) {

        int curindex = 0;
        if (lectures == null) {
            lectures = new Lecture[1];
        } else {
            curindex = lectures.length;
            int newLength = lectures.length * 3 / 2 + 1;
            lectures = Arrays.copyOf(lectures, newLength);
        }
        lectures[curindex] = lecture;

    }
}