package repos;

import entities.Entity;
import entities.Lecture;

import java.util.Arrays;

public class LectureRepo extends EntityRepo {

    private static Lecture[] lectures;

    public static Lecture[] getLectures() {
        return lectures;
    }

    @Override
    public void add(Lecture lecture) {

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

    @Override
    public Lecture[] getAll() {
        return lectures;
    }

    @Override
    public Lecture getById(int id) {
        Lecture lectFounded = null;
        int i = getIndexById(id);
        if (i != -1) {
            lectFounded = lectures[i];
        }
        if (lectFounded != null) {
            System.out.println("Founded lecture by id - "+lectFounded);
        }
        return lectFounded;
    }

    @Override
    public void deleteById(int id) {

        int i = getIndexById(id);
        if (i != -1) {
            lectures[i] = null;
        }

    }

    @Override
    protected int getIndexById(int id) {
        int index = -1;
        for (int i = 0; i < lectures.length; i++) {
            if (lectures[i] != null && lectures[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }

}