package com.hansda.StudentsSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hansda.StudentsSpring.entity.Student;
import com.hansda.StudentsSpring.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/students")
	public List<Student> getStudent() {
		return studentService.getStudents();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students/{name}")
	public void updateStudent(@RequestBody Student student, @PathVariable String name) {
		studentService.updateStudent(student, name);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{name}")
	public void deleteStudent(@PathVariable String name) {
		studentService.deleteStudent(name);
	}
}
