package utils;

import entities.Homework;
import repos.CourseRepo;
import repos.HomeworkRepo;

public class HomeworkUtils {
    public Homework create(int id){
        Homework hw = new Homework(id);
        HomeworkRepo homeworkRepo = new HomeworkRepo();
        homeworkRepo.add(hw);
        return hw;
    }
}
