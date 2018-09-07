package com.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class City {

    private int id_city;

    private String name;

    public City(String name) {
        this.name = name;
    }

    public City(int id_city, String name) {
        this.id_city = id_city;
        this.name = name;
    }

    public int getId_city() {
        return id_city;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return getId_city() == city.getId_city() &&
                Objects.equals(getName(), city.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId_city(), getName());
    }

    @Override
    public String toString() {
        return "City{" +
                "id_city=" + id_city +
                ", name='" + name + '\'' +
                '}';
    }
}
