package com.springrest.springrest.services;

import java.util.*;


import com.springrest.springrest.entities.Courses;
public interface CourseService {
	
	public List<Courses> getCourses();
	
	public Courses getCourse(long courseId);
	
	public Courses addCourse(Courses courses);

	 public Courses updateCourse(Courses courses);
	 
	 public void deleteCouse(long prashlong);

	

}
