package entities;

public class Teacher implements Comparable<Teacher> {
    private Integer id;
    private static int count;
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Teacher(int id) {
        this.id = id;
        count++;
    }

    public Teacher(int id, Person person) {
        this(id);
        this.person = person;
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
                ", person=" + person +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.person.compareTo(o.getPerson());
    }
}
