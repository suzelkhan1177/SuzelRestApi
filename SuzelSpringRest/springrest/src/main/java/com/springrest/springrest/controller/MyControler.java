package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;



@RestController
public class MyControler {
	
	@Autowired
	private CourseService courseSerivice;
	
	@Autowired
	private CourseDao userRepositery;
	
	
    @RequestMapping("/index")
  public String index() {
	  return "home";
  }
    
    @RequestMapping(path="/handelfrom", method = RequestMethod.GET)
    public String forHandler(@ModelAttribute("Courses") Courses courses ) {
    	
    	this.userRepositery.save(courses);
    	System.out.println(courses);
    	return "success";
    }
	
	//get Courses
	
	@GetMapping(value="/courses")
	public List<Courses> getCourses(){
		
		return this.courseSerivice.getCourses();
		
	}
	
	
	// course add
	@PostMapping("/courses")
	public Courses addCourse (@RequestBody Courses courses) {
		
		return this.courseSerivice.addCourse(courses);
	}
	
	
	// update Courses
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses courses) {
		
		return this.courseSerivice.updateCourse(courses);
	}
	
	
	// Delete Course
	@DeleteMapping("courses/{courseId}")
	
	public ResponseEntity<HttpStatus>  deleteCourse(@PathVariable String courseId){
		
		try {
			
			this.courseSerivice.deleteCouse(Long.parseLong(courseId));
			
			return new ResponseEntity<>(HttpStatus.OK);
			
		}catch (Exception e) {
			
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
