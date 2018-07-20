package com.models;

import java.io.Serializable;

public class Student {

    private String firstname;

    private String lastname;

    private City city;

    public Student(String firstname, String lastname, City city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
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
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", city=" + city +
                '}';
    }
}
