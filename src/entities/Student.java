package entities;

public class Student implements Comparable<Student>  {
    private Integer id;
    private static int count;
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Student(int id) {
        this.id = id;
        count++;
    }

    public Student(int id, Person person) {
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
        return "Student{" +
                "id=" + id +
                ", person=" + person +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.person.compareTo(o.getPerson());
    }
}
