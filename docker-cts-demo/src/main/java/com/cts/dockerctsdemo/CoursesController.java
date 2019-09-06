package com.cts.dockerctsdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursesController {
	
	@RequestMapping(path="/courses", method=RequestMethod.GET)
	public Course fetchCourse(){
		return new Course(34, "Angular", "ui framework from google!!");
	}
	
	

}
