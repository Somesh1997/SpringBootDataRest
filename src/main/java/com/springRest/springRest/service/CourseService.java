package com.springRest.springRest.service;

import java.util.*;
import com.springRest.springRest.entity.*;

public interface CourseService {

	public List<Course> getAllCourse();

	public Course getCourseById(int id);
	
	public Course addCourse(Course course);

	public Course deleteCourse(int id);
	
	public Course updateCourse(Course course,int id);
}
