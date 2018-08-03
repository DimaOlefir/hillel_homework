package com.repositories;

import com.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private CityRepository cityRepository;

    private List<Student> students;

    @PostConstruct
    public void init() {
        students = Arrays.asList(
                new Student("Petya", "Pyatochkin", cityRepository.getCityByID(0)),
                new Student("Vasiliy", "Pupkin", cityRepository.getCityByID(1)));
    }


    public List<Student> getAllStudents() {
        return students;
    }
}



