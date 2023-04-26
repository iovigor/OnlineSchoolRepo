package entities;

public class AdditionalMaterial extends Entity{
    private int id;
    private static int count;

    public AdditionalMaterial(int id) {
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
        return "AdditionalMaterial{" +
                "id=" + id +
                '}';
    }
}
