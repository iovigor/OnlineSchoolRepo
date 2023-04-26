package entities;

public class Homework extends Entity {
    private int id;
    private static int count;

    public Homework(int id) {
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
        return "Homework{" +
                "id=" + id +
                '}';
    }
}
