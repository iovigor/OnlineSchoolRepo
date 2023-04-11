package repos;

import entities.Course;
import entities.Homework;

import java.util.Arrays;

public class HomeworkRepo{

    public static Homework[] homeworks;
    public static void add(Homework homework) {

        int curindex = 0;
        if (homeworks == null) {
            homeworks = new Homework[1];
        } else {
            curindex = homeworks.length - 1;
            int newLength = homeworks.length * 3 / 2 + 1;
            homeworks = Arrays.copyOf(homeworks, newLength);
        }
        homeworks[curindex] = homework;

    }
}