package entities;

import utils.Utils;

public class Person  extends Entity {

    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private int courseId;
    private Role role;

    public Person(int id) {
        this.id = id;
    }
    public Person(int id, String firstName, String lastName, String phone, String email) {
        this(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.setPhone(phone);
        this.setEmail(email);
    }

    public Person(int id, int courseId, Role role) {
        this(id);
        this.courseId = courseId;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        Utils.validatePhone(phone);
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Utils.validateEmail(email);
        this.email = email;
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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", courseId=" + courseId +
                ", role=" + role +
                '}';
    }
}
