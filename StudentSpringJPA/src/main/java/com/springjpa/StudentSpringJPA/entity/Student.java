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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aid",referencedColumnName = "aid")
	Address addr;
	
	@OneToMany(mappedBy = "student", cascade=CascadeType.ALL)
	private List<Subject> subList = new ArrayList<Subject>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="student_course",
			joinColumns = @JoinColumn(name="sid"), 
			inverseJoinColumns = @JoinColumn(name="cid")
			)
	private List<Course> courses = new ArrayList<Course>();
	
	
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


	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	

	public Student(int sid, String s_name, String email, Address addr, List<Subject> subList, List<Course> courses) {
		super();
		this.sid = sid;
		this.s_name = s_name;
		this.email = email;
		this.addr = addr;
		this.subList = subList;
		this.courses = courses;
	}
	
	

	public Student(String s_name, String email, Address addr, List<Subject> subList, List<Course> courses) {
		super();
		this.s_name = s_name;
		this.email = email;
		this.addr = addr;
		this.subList = subList;
		this.courses = courses;
	}

	public Student() {
		super();
	}
	
	
}
