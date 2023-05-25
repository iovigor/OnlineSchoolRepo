package repos;

import java.util.Arrays;
import java.util.Iterator;

public class SimpleIterator <E> {

    private E[] elements;
    private int pos;

    public SimpleIterator(E[] elements, int pos) {
        this.elements = elements;
        this.pos = pos;
    }

    public boolean hasNext() {
        return elements[pos+1] != null;
    }
    public E next(){
        pos++;
        return elements[pos];
    }
    public void remove(){
        elements[pos] = null;
    }
    public E[] findAll(){
        return elements;
    }

    public E[] getElements() {
        return elements;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "SimpleIterator{" +
                "elements=" + Arrays.toString(elements) +
                ", pos=" + pos +
                '}';
    }
}
