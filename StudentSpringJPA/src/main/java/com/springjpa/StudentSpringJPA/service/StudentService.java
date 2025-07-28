package com.springjpa.StudentSpringJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.StudentSpringJPA.entity.Student;
import com.springjpa.StudentSpringJPA.entity.Subject;
import com.springjpa.StudentSpringJPA.repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
	StudentRepo sr;
    @Autowired
    Subject sub;
    
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
		if(s.getSubList()!=null)
		{
			for(Subject subject:s.getSubList())
			{
				subject.setStudent(s);
			}
		}
		return sr.save(s);
	}

	public String updateStudent(int sid,
			Student us) 
	{
		if(sr.existsById(sid))
		{
			Student es = sr.getById(sid);
			if(us.getS_name()!=null)
			{
				es.setS_name(us.getS_name());
			}
			else {
				es.setS_name(es.getS_name());
			}
			
			if(us.getEmail()!=null)
			{
				es.setEmail(us.getEmail());
			}
			else {
				es.setEmail(es.getEmail());
			}
			if(us.getAddr().getArea()!=null)
			{
				es.getAddr().setArea(us.getAddr().getArea());
			}
			else
			{
				es.getAddr().setArea(es.getAddr().getArea());
			}
			
			if(us.getAddr().getMobile()!=0)
			{
				es.getAddr().setMobile(us.getAddr().getMobile());
			}
			else
			{
				es.getAddr().setMobile(es.getAddr().getMobile());
			}
			
			if(us.getAddr().getStreet()!=null)
			{
				es.getAddr().setStreet(us.getAddr().getStreet());
			}
			else
			{
				es.getAddr().setStreet(es.getAddr().getStreet());
			}
			
			if(us.getAddr().getCity()!=null)
			{
				es.getAddr().setCity(us.getAddr().getCity());
			}
			else
			{
				es.getAddr().setCity(es.getAddr().getCity());
			}
			
			if(us.getAddr().getCountry()!=null)
			{
				es.getAddr().setCountry(us.getAddr().getCountry());
			}
			else
			{
				es.getAddr().setCountry(es.getAddr().getCountry());
			}
			
			sr.save(es);
			return "Success";
		}
		else {
			return "No such student id";
		}
	}
	
}







