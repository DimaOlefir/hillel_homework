package com.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.services.StudentService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-application.xml");

        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);

        resp.getWriter().println(studentService.getAllStudents());
    }
}
