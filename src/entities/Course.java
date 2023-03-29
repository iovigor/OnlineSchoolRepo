package entities;

public class Course {
    private int id;
    private static int count;

    public Course(int id) {
        this.id = id;
        count++;
    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }
}
