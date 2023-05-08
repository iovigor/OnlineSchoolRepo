package entities;

public class Lecture extends Entity {
    private int id;
    private int courseId;
    private int personId;
    private static int count;
    private Homework hw;
    private AdditionalMaterial addMat;

    public Lecture(int id) {
        this.id = id;
        count++;
    }

    public Lecture(int id, int courseId, Homework hw, AdditionalMaterial addMat) {
        this(id);
        this.courseId = courseId;
        this.hw = hw;
        this.addMat = addMat;
    }
    public Lecture(int id, int courseId, int personId) {
        this(id);
        this.courseId = courseId;
        this.personId = personId;
    }
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", personId=" + personId +
                ", hw=" + hw +
                ", addMat=" + addMat +
                '}';
    }
}
