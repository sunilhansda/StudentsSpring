package com.hansda.StudentsSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hansda.StudentsSpring.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
