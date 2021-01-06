package com.hansda.StudentsSpring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hansda.StudentsSpring.entity.Student;
import com.hansda.StudentsSpring.entity.Subject;
import com.hansda.StudentsSpring.repository.StudentRepository;
import com.hansda.StudentsSpring.repository.SubjectRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private SubjectRepository subjectRepository;
	
	public void addStudent(Student student) {
//		Subject x = new Subject();
//		x.setSubjectId(12);
//		student.setSubject(x);
		studentRepository.save(student);
	}
	
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students :: add);
		return students;
	}
	
	public void updateStudent(Student student, String name) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(String name) {
		studentRepository.deleteById(name);
	}
}
