package com.services;

import com.models.City;
import com.models.Student;
import com.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("studentService")
public class StudentService {

    private List<City> cities;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CityService cityService;

    @PostConstruct
    public void init() {
        cities = cityService.getAllCities();
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }
}
