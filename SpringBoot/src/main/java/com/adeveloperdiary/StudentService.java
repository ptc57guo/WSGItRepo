package com.adeveloperdiary;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/student")

public class StudentService {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public HashMap<Long, Student> getAllStudents(){
		return Application.hmStudent;
	}
}
