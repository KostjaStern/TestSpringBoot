package com.sternkn.springboot.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sternkn.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
