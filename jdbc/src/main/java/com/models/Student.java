package com.models;

import java.io.Serializable;
import java.util.Objects;

public class Student {

    private int id_student;

    private String firstname;

    private String lastname;

    private City city;

    public Student(int id_student, String firstname, String lastname, City city) {
        this.id_student = id_student;
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
    }

    public Student(String firstname, String lastname, City city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId_student() == student.getId_student() &&
                Objects.equals(getFirstname(), student.getFirstname()) &&
                Objects.equals(getLastname(), student.getLastname()) &&
                Objects.equals(getCity(), student.getCity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId_student(), getFirstname(), getLastname(), getCity());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_student=" + id_student +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", city=" + city +
                '}' + '\n';
    }
}
