package com.sternkn.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student
{
   @Id
   @GeneratedValue(generator = "Student_id")
   @GenericGenerator(name = "Student_id", strategy = "com.sternkn.springboot.model.StudentGenerator")
   private String id;
   private String email;
   private String name;

   public Student()
   {
   }

   public String getId()
   {
       return id;
   }
   public void setId(String id)
   {
       this.id = id;
   }

   public String getName()
   {
       return name;
   }
   public void setName(String name)
   {
       this.name = name;
   }

   public String getEmail()
   {
       return email;
   }
   public void setEmail(String email)
   {
       this.email = email;
   }
}
