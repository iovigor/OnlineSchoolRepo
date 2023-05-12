package utils;

import entities.Homework;
import entities.Lecture;
import repos.CourseRepo;
import repos.GenericRepo;
import repos.HomeworkRepo;
import repos.LectureRepo;

public class HomeworkUtils {
    public Homework create(int id){
        Homework hw = new Homework(id);
        HomeworkRepo homeworkRepo = new HomeworkRepo();
        homeworkRepo.add(hw);
        return hw;
    }
}
