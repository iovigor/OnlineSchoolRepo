package utils;

import entities.AdditionalMaterial;
import entities.Homework;
import entities.Lecture;

public class LectureUtils {
    public Lecture create(int id){
        Lecture lect = new Lecture(id);
        return lect;
    }

    public Lecture create(int id, int courseId, Homework hw, AdditionalMaterial addMat){
        Lecture lect = new Lecture(id, courseId, hw, addMat);
        return lect;
    }
}
