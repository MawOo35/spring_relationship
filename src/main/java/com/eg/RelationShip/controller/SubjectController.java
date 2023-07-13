package com.eg.RelationShip.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eg.RelationShip.entity.Subject;
import com.eg.RelationShip.repository.StudentRepository;
import com.eg.RelationShip.repository.SubjectRepository;
import com.eg.RelationShip.repository.TeacherRepository;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
	
	 @Autowired
	    SubjectRepository subjectRepository;

	    @Autowired
	    StudentRepository studentRepository;

	    @Autowired
	    TeacherRepository teacherRepository;
	
	 @GetMapping
	    List<Subject> getSubjects() {
	        return subjectRepository.findAll();
	    }

	    @PostMapping
	    Subject createSubject(@RequestBody Subject subject) {
	        return subjectRepository.save(subject);
	    }

}
