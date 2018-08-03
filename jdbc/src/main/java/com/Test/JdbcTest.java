package com.Test;

import com.models.City;
import com.models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //JDBC API
        Class.forName("org.h2.Driver");
        Connection connection = DriverManager.
                getConnection("jdbc:h2:file:D:/hillel Tasha/hillel_homework/jdbc/DB/h2", "sa", "sa");
        PreparedStatement preparedStatement = connection.prepareStatement("select ID_CITY, NAME FROM CITY");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<City> cityList = new ArrayList();
        System.out.println("::::::::::::Table CITY::::::::::::");
        while (resultSet.next()) {
            int id_city = resultSet.getInt(1);//id -> from users table
            String name = resultSet.getString(2);//name -> from users table
            String format = String.format("id=%s, name=%s", id_city, name);
            cityList.add(new City(id_city, name));
            System.out.println(format);
        }
        System.out.println(cityList);


        System.out.println("\n" + "::::::::::::Table STUDENT::::::::::::");
        preparedStatement = connection.prepareStatement
                ("select ID_STUDENT, FIRSTNAME, LASTNAME, CITY_ID, NAME FROM STUDENT " +
                        "INNER JOIN CITY ON STUDENT.CITY_ID = CITY.ID_CITY");
        resultSet = preparedStatement.executeQuery();
        List<Student> students = new ArrayList();
        while (resultSet.next()) {
            int id_student = resultSet.getInt(1);//id -> from users table
            String firstname = resultSet.getString(2);//firstname -> from users table
            String lastname = resultSet.getString(3);//lastname -> from users table
            int id_city = resultSet.getInt(4);//id_city-> from users table
            String cityName = resultSet.getString(5);//city -> from users table
            String format = String.format("id=%s, firstname=%s, lastname=%s, city=%s",
                    id_student, firstname, lastname, cityName);
            students.add(new Student(id_student, firstname, lastname, new City(id_city, cityName)));
            System.out.println(format);
        }
        System.out.println(students);

        connection.close();


    }
}
