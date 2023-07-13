package com.eg.RelationShip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eg.RelationShip.entity.Student;
import com.eg.RelationShip.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentContoller {
	
	  @Autowired
	    StudentRepository studentRepository;

	    @GetMapping
	    List<Student> getStudents() {
	        return studentRepository.findAll();
	    }

	    @PostMapping
	    Student createStudent(@RequestBody Student student) {
	        return studentRepository.save(student);
	    }

}
