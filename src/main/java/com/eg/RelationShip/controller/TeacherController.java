package com.eg.RelationShip.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eg.RelationShip.entity.Teacher;
import com.eg.RelationShip.repository.TeacherRepository;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
	
	 @Autowired
	    TeacherRepository teacherRepository;

	    @GetMapping
	    List<Teacher> getTeachers() {
	        return teacherRepository.findAll();
	    }

	    @PostMapping
	    Teacher createTeacher(@RequestBody Teacher teacher) {
	        return teacherRepository.save(teacher);
	    }

}
