package com.springjpa.StudentSpringJPA.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Component
@Table(name="subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="subid")
	int subId;
	
	@Column(name="subname")
	String subName;
	
	@Column(name="trainer")
	String trainer;
	
	@Column(name="duration")
	int duration;
	
	@ManyToOne
	@JoinColumn(name="sid")
	private Student student;

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Subject(int subId, String subName, String trainer, int duration, Student student) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.trainer = trainer;
		this.duration = duration;
		this.student = student;
	}

	public Subject(String subName, String trainer, int duration, Student student) {
		super();
		this.subName = subName;
		this.trainer = trainer;
		this.duration = duration;
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject() {
		super();
	}
	
	
}

