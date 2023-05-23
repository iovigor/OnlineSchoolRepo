package repos;

import entities.Person;

public interface PersonInt {
    void add(Person person);
    Person[] getAll();
    Person getById(int id);
    void deleteById(int id);
    int getIndexById(int id);
}
