package com.nt.service;

import java.util.Optional;

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
	public Student getStudentById(int id) {
		Optional<Student> sts = studentrepo.findById(id);
		Student st= null;
		if(sts.isPresent()) {
			st=sts.get();
		}
		return st;
	}

}
