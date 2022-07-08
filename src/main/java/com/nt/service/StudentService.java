package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.model.Student;
import com.nt.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentrepo;
	
	public Student saveStudent(Student st) {
		Student stt = studentrepo.save(st);
		return stt;
	}

}
