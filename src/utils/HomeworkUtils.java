package utils;

import entities.Homework;
import repos.HomeworkRepo;

public class HomeworkUtils {
    public Homework create(int id){
        Homework hw = new Homework(id);
        HomeworkRepo.add(hw);
        return hw;
    }
}
