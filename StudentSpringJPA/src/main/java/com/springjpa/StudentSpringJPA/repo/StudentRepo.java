package com.springjpa.StudentSpringJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springjpa.StudentSpringJPA.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
