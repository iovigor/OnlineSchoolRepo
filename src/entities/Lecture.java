package entities;

import java.util.Arrays;

public class Lecture {
    private Integer id;
    private String name;
    private String description;
    private int courseId;
    private int personId;
    private static int count;
    private Homework hw;
    private AdditionalMaterial addMat;
    private Homework[] homeworks;

    public Lecture(int id) {
        this.id = id;
        count++;
    }
    public Lecture(int id, String name, String description) {
        this(id);
        this.name = name;
        this.description = description;
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

    public Homework[] getHomeworks() {
        return homeworks;
    }

    public void setHomeworks(Homework[] homeworks) {
        this.homeworks = homeworks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", courseId=" + courseId +
                ", personId=" + personId +
                ", hw=" + hw +
                ", addMat=" + addMat +
                ", homeworks=" + Arrays.toString(homeworks) +
                '}';
    }
}
