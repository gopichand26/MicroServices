package com.dxc.studentmarks.resource;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dxc.studentmarks.model.Marks;
import com.dxc.studentmarks.model.Student;
import com.dxc.studentmarks.model.StudentMarks;


@RestController
@RequestMapping("/studentmarks")
public class StudentMarksResource {
	

	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("{id}")
	public StudentMarks getStudentMarks(@PathVariable ("id") int studid) {

		
	Student student = restTemplate.getForObject("http://student-service/student/"+studid, Student.class);
		
		Marks marks = restTemplate.getForObject("http://marks-service/marks/"+studid, Marks.class); 
		
		
		return new StudentMarks(student.getName(), 
				Arrays.asList(marks)
				);
	}
	
	
}
