package com.sternkn.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sternkn.springboot.model.Student;

@Service
public class StudentService
{
   @Autowired
   private StudentRepository studentRepository;
   
   public List<Student> list()
   {
      return studentRepository.findAll();
   }
   
   public void addNew()
   {
      Student student = new Student();
      student.setName("Kos");
      student.setEmail("kos@gmail.com");
      
      studentRepository.saveAndFlush(student);
   }
}
