package utils;

import entities.*;

import repos.PersonRepo;

public class PersonUtils {
    public Person create(int id){
        Person st = new Person(id);
        PersonRepo personRepo = new PersonRepo();
        personRepo.add(st);
        return st;
    }
    public Person create(int id, String firstName, String lastName, String phone, String email){
        Person st = new Person(id, firstName, lastName, phone, email);
        PersonRepo personRepo = new PersonRepo();
        personRepo.add(st);
        return st;
    }
    public Person create(int id, int courseId, Role role){
        Person person = new Person(id, courseId, role);
        PersonRepo personRepo = new PersonRepo();
        personRepo.add(person);
        return person;
    }


}
