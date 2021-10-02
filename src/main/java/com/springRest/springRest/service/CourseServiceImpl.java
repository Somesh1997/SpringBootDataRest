package com.springRest.springRest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springRest.springRest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course("Java Course", 145, "this course contains basics of Java"));
		list.add(new Course("Spring Boot Course", 1345, "creating Rest API using Spring Boot"));
	}

	@Override
	public List<Course> getAllCourse() {
		return list;
	}

	public Course getCourseById(int id) {
		// TODO Auto-generated method stub

		Course course = list.stream().filter(i -> i.getId() == id).findAny().orElse(null);

		return course;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	@Override
	public Course deleteCourse(int id) {
		List<Course> collect = list.stream().filter(i->i.getId()!=id).collect(Collectors.toList());
		if(collect.size()!=list.size()) {
			list=collect;
			return list.stream().filter(i->i.getId()==id).findFirst().get();
		}
		else {
			return null;
		}
		
	}

	@Override
	public Course updateCourse(Course course, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
