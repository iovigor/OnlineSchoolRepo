package utils;

import entities.*;
import repos.LectureRepo;

public class LectureUtils {
    public Lecture create(int id){
        Lecture lect = new Lecture(id);
        LectureRepo lectureRepo = new LectureRepo();
        lectureRepo.add(lect);
        return lect;
    }
    public Lecture create(int id, String name, String description){
        Lecture lect = new Lecture(id, name, description);
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

    public Lecture create(int id, int courseId, int personId){
        Lecture lect = new Lecture(id, courseId, personId);
        LectureRepo lectureRepo = new LectureRepo();
        lectureRepo.add(lect);
        return lect;
    }

}
