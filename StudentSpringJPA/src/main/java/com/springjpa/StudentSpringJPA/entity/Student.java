package com.springjpa.StudentSpringJPA.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	
	
	public Address getAddr() {
		return addr;
	}



	public void setAddr(Address addr) {
		this.addr = addr;
	}



	public Student()
	{
		
	}

	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", s_name=" + s_name + ", email=" + email + ", courses=" + courses + ", aid="
				+ addr + "]";
	}





	public Student(String s_name, String email, String courses, Address aid) {
		super();
		this.s_name = s_name;
		this.email = email;
		this.courses = courses;
		this.addr = aid;
	}



	public Student(int sid, String s_name, String email, String courses, Address aid) {
		super();
		this.sid = sid;
		this.s_name = s_name;
		this.email = email;
		this.courses = courses;
		this.addr = aid;
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
	
	
}
