package utils;

import entities.Homework;

public class HomeworkUtils {
    public Homework create(int id){
        Homework hw = new Homework(id);
        return hw;
    }
}
