package repos;

import entities.EntityNotFoundException;
import entities.Person;

import java.util.Arrays;

public class PersonRepo implements PersonInt {

    private static Person[] persons;

    @Override
    public void add(Person person) {

        int curindex = 0;
        if (persons == null) {
            persons = new Person[1];
        } else {
            curindex = persons.length;
            int newLength = persons.length + 1;
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
        Person person = null;
        int i = getIndexById(id);
        if (i != -1) {
            person = persons[i];
        }
        if (person == null) {
            try {
                throw new EntityNotFoundException();
            } catch (EntityNotFoundException e) {
                System.out.println(e.getMessage());;
            }
        }
        return person;
    }

    @Override
    public void deleteById(int id) {

        int i = getIndexById(id);
        if (i != -1) {
            persons[i] = null;
        }

    }

    @Override
    public int getIndexById(int id) {
        int index = -1;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }

}
