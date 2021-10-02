package com.springRest.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.springRest.entity.Course;
import com.springRest.springRest.service.CourseService;

@RestController
public class MyController {

	@Autowired
	CourseService courseService;

	public MyController() {
		System.out.println("Controller ");
	}

	@GetMapping("/home")
	public String home() {
		return "Welcome to Course Application";
	}
	// get the course

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return courseService.getAllCourse();

	}

}
