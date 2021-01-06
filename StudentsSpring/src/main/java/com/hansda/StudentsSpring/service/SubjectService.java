package com.hansda.StudentsSpring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hansda.StudentsSpring.entity.Subject;
import com.hansda.StudentsSpring.repository.SubjectRepository;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;

	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}

	public List<Subject> getSubject() {
		List<Subject> subjects = new ArrayList<>();
		subjectRepository.findAll().forEach(subjects :: add);
		return subjects;
	}

	public void updateSubject(Subject subject, String id) {

	}
}
