package utils;

import entities.Lecture;

public class LectureUtils {
    public Lecture create(int id){
        Lecture lect = new Lecture(id);
        return lect;
    }
}
