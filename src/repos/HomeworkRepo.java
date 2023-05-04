package repos;

import entities.Course;
import entities.Homework;

import java.util.Arrays;

public class HomeworkRepo extends EntityRepo {

    private static Homework[] homeworks;
    @Override
    public void add(Homework homework) {

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

    public static Homework[] getHomeworks() {
        return homeworks;
    }

    @Override
    public Homework[] getAll() {
        return homeworks;
    }

    @Override
    public Homework getById(int id) {
        Homework hw = null;
        int i = getIndexById(id);
        if (i != -1) {
            hw = homeworks[i];
        }
        return hw;
    }

    @Override
    public void deleteById(int id) {

        int i = getIndexById(id);
        if (i != -1) {
            homeworks[i] = null;
        }

    }

    @Override
    protected int getIndexById(int id) {
        int index = -1;
        for (int i = 0; i < homeworks.length; i++) {
            if (homeworks[i] != null && homeworks[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }
}