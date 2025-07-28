package com.springjpa.StudentSpringJPA.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	@Column(name="duration")
	private int duration;
	
	@ManyToMany(mappedBy = "courses")
	@JsonManagedReference
	private List<Student> students = new ArrayList<Student>();

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", students=" + students + "]";
	}

	public Course(int cid, String cname, int duration, List<Student> students) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.students = students;
	}

	public Course(String cname, int duration, List<Student> students) {
		super();
		this.cname = cname;
		this.duration = duration;
		this.students = students;
	}

	public Course() {
		super();
	}
	
}




