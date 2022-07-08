package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Student;
import com.nt.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	private StudentService studentser;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Student Management";
	}
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student st) {
		Student stt = studentser.saveStudent(st);
		return stt;
	}

}
