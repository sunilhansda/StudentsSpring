package com.hansda.StudentsSpring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "student")
public class Student { //owning-side

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "name")
	private String name;

	@Column(name = "rollno")
	private int rollno;

	@Column(name = "subject_id")
	private int subjectId; // foreign key

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "subject_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Subject subject;

	public Student() {
	}

	public Student(String name, int rollno, int subjectId) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.subjectId = subjectId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@JsonBackReference
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
