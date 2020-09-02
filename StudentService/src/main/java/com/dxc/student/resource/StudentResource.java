package com.dxc.student.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.student.model.Student;
import com.dxc.student.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentResource {
	
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping("/{id}")
	public Student getStudent(@PathVariable("id") int studid) {
		Student student = studentRepository.findById(studid).orElse(new Student());
		return student;
	}

}
