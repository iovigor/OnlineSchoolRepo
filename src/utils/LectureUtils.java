package utils;

import entities.AdditionalMaterial;
import entities.Homework;
import entities.Lecture;
import repos.HomeworkRepo;
import repos.LectureRepo;

public class LectureUtils {
    public Lecture create(int id){
        Lecture lect = new Lecture(id);
        LectureRepo lectureRepo = new LectureRepo();
        lectureRepo.add(lect);
        return lect;
    }

    public Lecture create(int id, int courseId, Homework hw, AdditionalMaterial addMat){
        Lecture lect = new Lecture(id, courseId, hw, addMat);
        LectureRepo lectureRepo = new LectureRepo();
        lectureRepo.add(lect);
        return lect;
    }
}
