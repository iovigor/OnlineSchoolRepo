package entities;

public class Person  extends Entity {

    private int id;
    private int courseId;
    private Role role;

    public Person(int id) {
        this.id = id;
    }

    public Person(int id, int courseId, Role role) {
        this(id);
        this.courseId = courseId;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public int getCourseId() {
        return courseId;
    }

    public Role getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", role=" + role +
                '}';
    }
}
