package com.hansda.StudentsSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hansda.StudentsSpring.entity.Subject;
import com.hansda.StudentsSpring.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/subjects")
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/subjects")
	public List<Subject> getSubject() {
		//System.out.println(subjectService.getSubject(sname).getSubjectName());
		return subjectService.getSubject();
	}
	
}
