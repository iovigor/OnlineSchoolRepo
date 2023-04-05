package entities;

public class Lecture {
    private int id;
    public int courseId;
    private static int count;
    private Homework hw;
    private AdditionalMaterial addMat;

    public Lecture(int id) {
        this.id = id;
        count++;
    }

    public Homework getHw() {
        return hw;
    }

    public AdditionalMaterial getAddMat() {
        return addMat;
    }

    public int getId() {
        return id;
    }

    public int getCourseId() {
        return courseId;
    }
    public static int getCount() {
        return count;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public void setHw(Homework hw) {
        this.hw = hw;
    }

    public void setAddMat(AdditionalMaterial addMat) {
        this.addMat = addMat;
    }

    public void setId(int id) {
        this.id = id;
    }
}
