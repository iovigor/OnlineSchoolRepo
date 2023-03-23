import entities.Lecture;
import utils.LectureUtils;

public class Main {
    public static void main(String[] args) {

        LectureUtils LecUtils = new LectureUtils();
        Lecture lec1 = LecUtils.create(1);
        Lecture lec2 = LecUtils.create(2);
        Lecture lec3 = LecUtils.create(3);
        Lecture lec6 = LecUtils.create(6);
        System.out.println("Lecture count = "+Lecture.getCount());

    }
}