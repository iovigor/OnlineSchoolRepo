package repos;

import entities.*;


import java.util.Arrays;

public abstract class EntityRepo {

    public void add(AdditionalMaterial addMat){};

    public void add(Course course){};

    public void add(Homework homework){};

    public void add(Lecture lecture){};

    public void add(Student student){};

    public void add(Teacher teacher){};

    public void add(Person person){};

    public abstract Entity[] getAll();

    public abstract Entity getById(int id);

    public abstract void deleteById(int id);

    protected abstract int getIndexById(int id);

}
