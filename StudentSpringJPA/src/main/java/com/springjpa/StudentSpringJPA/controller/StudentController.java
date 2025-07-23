package com.springjpa.StudentSpringJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.StudentSpringJPA.entity.Student;
import com.springjpa.StudentSpringJPA.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService ss;
	
	@GetMapping("/")
	List<Student> getAll()
	{
		return ss.getAll();
	}
	
	@DeleteMapping("/{id}")
	String delete(@PathVariable("id") int sid) {
		return ss.deleteOneStudent(sid);
	}
	
	@PutMapping("/")
	Student insert(@RequestBody Student s)
	{
		System.out.println(s);
		
		return ss.insertStudent(s);
	}
	
	@PostMapping("/{id}")
	void update(@PathVariable("id") int sid,
			@RequestBody Student s)
	{
		ss.updateStudent(sid,s);
	}
}











