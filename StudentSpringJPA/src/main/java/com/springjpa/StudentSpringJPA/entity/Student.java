package com.springjpa.StudentSpringJPA.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int sid;
	@Column(name="s_name")
	String s_name;
	@Column(name="email")
	String email;
	@Column(name="courses")
	String courses;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aid",referencedColumnName = "aid")
	Address addr;
	
	@OneToMany(mappedBy = "student", cascade=CascadeType.ALL)
	private List<Subject> subList = new ArrayList<Subject>();
	
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

 

	public List<Subject> getSubList() {
		return subList;
	}

	public void setSubList(List<Subject> subList) {
		this.subList = subList;
	}
	
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public Student(int sid, String s_name, String email, String courses, Address addr, List<Subject> subList) {
		super();
		this.sid = sid;
		this.s_name = s_name;
		this.email = email;
		this.courses = courses;
		this.addr = addr;
		this.subList = subList;
	}

	public Student(String s_name, String email, String courses, Address addr, List<Subject> subList) {
		super();
		this.s_name = s_name;
		this.email = email;
		this.courses = courses;
		this.addr = addr;
		this.subList = subList;
	}

	public Student() {
		super();
	}
	
	
}
