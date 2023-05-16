package repos;

import entities.*;

import java.util.Arrays;

public class GenericRepo <T extends Entity> {

    private T[] elements;

    public GenericRepo(T[] elementsIn) {
        elements = elementsIn;
    }

    public int size(){
        return elements.length;
    }
    public boolean isEmpty() {
        boolean isEmpty = true;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                isEmpty = false;
            }
        }
        return isEmpty;
    }
    public T get(int index) {
        return elements[index];
    }

    public T[] getElements() {
        return elements;
    }

    public void add(T element) {

        int curindex = 0;
        if (elements == null) {
            System.out.println("Elements are undefined!");
        } else {
            curindex = elements.length;
            int newLength = elements.length + 1;
            elements = Arrays.copyOf(elements, newLength);
        }
        elements[curindex] = element;

    }
    public void add(int index, T element) {
        if ((elements.length-1) < index) {
            elements = Arrays.copyOf(elements, index+1);
        }
        elements[index] = element;
    }
    public void remove (int index) {
        if ((elements.length-1) < index) {
            elements = Arrays.copyOf(elements, index - 1);
        }
        elements[index] = null;
    }
    public T[] getAll() {
        return elements;
    }


    public T getById(int id) {
        T elemFounded = null;
        int i = getIndexById(id);
        if (i != -1) {
            elemFounded = elements[i];
        }
        if (elemFounded != null) {
            System.out.println("Founded lecture by id - "+elemFounded);
        }
        return elemFounded;
    }


    public void deleteById(int id) {

        int i = getIndexById(id);
        if (i != -1) {
            elements[i] = null;
        }

    }

    protected int getIndexById(int id) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null && elements[i].getId() == id) {
                index = i;
            }
        }
        return index;
    }
}
