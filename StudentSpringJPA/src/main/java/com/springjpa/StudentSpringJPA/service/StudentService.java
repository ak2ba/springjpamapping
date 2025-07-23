package com.springjpa.StudentSpringJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.StudentSpringJPA.entity.Student;
import com.springjpa.StudentSpringJPA.repo.StudentRepo;
@Service
public class StudentService {
	@Autowired
	StudentRepo sr;

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	public String deleteOneStudent(int sid) {
		if(sr.existsById(sid))
		{
			sr.deleteById(sid);
			return "User Deleted";
		}
		return "No such user";
	}

	public Student insertStudent(Student s) {
		return sr.save(s);
	}

	public String updateStudent(int sid,
			Student us) 
	{
		if(sr.existsById(sid))
		{
			Student es = sr.getById(sid);
			es.setS_name(us.getS_name());
			es.setEmail(us.getEmail());
			es.setCourses(us.getCourses());
			sr.save(es);
			return "Success";
		}
		else {
			return "No such student id";
		}
	}
	
}







