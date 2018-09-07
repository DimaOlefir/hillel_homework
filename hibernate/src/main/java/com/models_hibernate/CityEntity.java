package com.models_hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CITY", schema = "PUBLIC", catalog = "H2")
public class CityEntity {
    private int idCity;
    private String name;
    private List<StudentEntity> studentEntities;

    @Id
    @Column(name = "ID_CITY")
    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "cityEntity")
    public List<StudentEntity> getStudentEntities() {
        return studentEntities;
    }

    public void setStudentEntities(List<StudentEntity> studentEntities) {
        this.studentEntities = studentEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (idCity != that.idCity) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCity;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CityEntity{" +
                "idCity=" + idCity +
                ", name='" + name + '\'' +
                '}';
    }
}
