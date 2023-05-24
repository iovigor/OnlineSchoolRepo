package entities;

public class Course {
    private Integer id;
    private String name;
    private static int count;
    private Teacher teacher;
    private Student student;
    private Lecture lecture;

    public Course(int id) {
        this.id = id;
        count++;
    }

    public Course(int id, String name) {
        this(id);
        this.name = name;
    }
    public Course(int id, Teacher teacher, Student student, Lecture lecture) {
        this(id);
        this.teacher = teacher;
        this.student = student;
        this.lecture = lecture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Student getStudent() {
        return student;
    }

    public Lecture getLecture() {
        return lecture;
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
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", student=" + student +
                ", lecture=" + lecture +
                '}';
    }
}
