package mod.controllers;

import mod.models.Student;
import mod.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public @ResponseBody
    List<Student> getAllUsers() {
        return studentService.getAllStudents();
    }

}
