package com.hansda.StudentsSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hansda.StudentsSpring.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

	Subject findBySubjectId(int id);
}
