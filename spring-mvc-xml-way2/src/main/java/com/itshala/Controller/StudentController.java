package com.itshala.Controller;

import com.itshala.Model.Student;
import com.itshala.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor

public class StudentController {
    StudentService studentService;
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView getAllStudents(){

        List<Student> studentList=studentService.getAllStudent();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("students",studentList);
        studentList.forEach(System.out::println);
        return modelAndView;
    }

}
