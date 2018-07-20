package com.servlets;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.services.CityService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CityServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-application.xml");

        CityService cityService = applicationContext.getBean("cityService", CityService.class);

        resp.getWriter().println(cityService.getAllCities());
    }
}
