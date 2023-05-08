package repos;

import entities.Person;

import java.util.Arrays;

public class PersonRepo extends EntityRepo {

    private static Person[] persons;

    @Override
    public void add(Person person) {

        int curindex = 0;
        if (persons == null) {
            persons = new Person[1];
        } else {
            curindex = persons.length - 1;
            int newLength = persons.length * 3 / 2 + 1;
            persons = Arrays.copyOf(persons, newLength);
        }
        persons[curindex] = person;

    }

    public static Person[] getStudents() {
        return persons;
    }

    @Override
    public Person[] getAll() {
        return persons;
    }

    @Override
    public Person getById(int id) {
        Person student = null;
        int i = getIndexById(id);
        if (i != -1) {
            student = persons[i];
        }
        return student;
    }

    @Override
    public void deleteById(int id) {

        int i = getIndexById(id);
        if (i != -1) {
            persons[i] = null;
        }

    }

    @Override
    protected int getIndexById(int id) {
        int index = -1;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }

}
