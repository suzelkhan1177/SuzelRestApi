package com.springrest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springrest.springrest.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Long> , CrudRepository<Courses,Long>{

}
