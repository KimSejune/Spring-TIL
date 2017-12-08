package com.java.ut;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@RequestMapping(value="/studentForm", method = RequestMethod.GET)
	public String studentForm() {
		return "student/createPage";
	}
	
	@RequestMapping(value="/student/createDonePage")
	public String studentCreate(@ModelAttribute("student") Student student, BindingResult result) {
		String page = "student/createDonePage";
		
		StudentValidator svalidator = new StudentValidator();
		svalidator.validate(student, result);
		
		if(result.hasErrors()) {
			page = "student/createPage";
		}
		
		return page;
	}
}
