package com.sternkn.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sternkn.springboot.model.Student;
import com.sternkn.springboot.services.StudentService;

@RestController
@ComponentScan("com.sternkn.springboot")
@EnableAutoConfiguration
public class Example
{
   @Autowired
   private StudentService studentService;
   
   @RequestMapping("/")
   public String home()
   {
      studentService.addNew();
      
      List<Student> students = studentService.list();
      
      return "students = " + students.size();
   }
   
   public static void main(String[] args)
   {
      SpringApplication.run(Example.class, args);
   }
}