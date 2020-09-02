package com.dxc.marks.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.marks.model.Marks;
import com.dxc.marks.repository.MarksRepository;

@RestController
@RequestMapping("/marks")
public class MarksResource {

	@Autowired
	MarksRepository marksRepository;

	@RequestMapping("/{id}")
	public Marks getStudent(@PathVariable("id") int studid) {
		Marks marks = marksRepository.findById(studid).orElse(new Marks());
		return marks;
	}

}
