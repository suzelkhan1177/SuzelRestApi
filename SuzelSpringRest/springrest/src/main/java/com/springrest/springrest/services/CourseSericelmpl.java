package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.entities.Courses;


@Service
@Transactional
public class CourseSericelmpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	public CourseSericelmpl() {
		
	}
	
	
	@Override
	public List<Courses> getCourses() {
	
		
		return courseDao.findAll();

	}


	@Override
	public Courses getCourse(long courseId) {

		
		return courseDao.getOne(courseId);
	}


	@Override
	public Courses addCourse(Courses courses) {
		

		courseDao.save(courses);
		
		return courses;
	}


	@Override
	public Courses updateCourse(Courses courses) {

		courseDao.save(courses);
		return courses;
	}


	@Override
	public void deleteCouse(long prashlong) {
		
		Courses entity = courseDao.getOne(prashlong);
		courseDao.delete(entity);
		
	}

}
