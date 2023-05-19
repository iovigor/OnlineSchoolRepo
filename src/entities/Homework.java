package entities;

public class Homework {
    private int id;
    private int lectureId;
    private String task;
    private static int count;

    public Homework(int id) {
        this.id = id;
        count++;
    }

    public Homework(int id, String task) {
        this(id);
        this.task = task;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
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
                ", lectureId=" + lectureId +
                ", task='" + task + '\'' +
                '}';
    }
}
