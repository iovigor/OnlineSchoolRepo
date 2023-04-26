package entities;

public class Teacher extends Entity {
    private int id;
    private static int count;

    public Teacher(int id) {
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

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                '}';
    }
}
