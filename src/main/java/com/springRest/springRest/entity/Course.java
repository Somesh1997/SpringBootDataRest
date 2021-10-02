package com.springRest.springRest.entity;

import org.springframework.stereotype.Component;

@Component
public class Course {
	private String title;
	private long id;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [title=" + title + ", id=" + id + ", description=" + description + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String description;

	public Course(String title, long id, String description) {
		super();
		this.title = title;
		this.id = id;
		this.description = description;
	}
}
