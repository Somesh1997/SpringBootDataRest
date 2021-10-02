package com.springRest.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("/course/{id}")
	public Course getCourseById(@PathVariable("id") int id) {
		return courseService.getCourseById(id);
	}

	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}

}
