package com.java.an;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public String studentCreate(@ModelAttribute("student") @Valid Student student, BindingResult result) {
		String page = "student/createDonePage";
		
		// 밑의 @InitBinder처리로 인하여 필요없게되었다.
//		StudentValidator svalidator = new StudentValidator();
//		svalidator.validate(student, result);
		
		if(result.hasErrors()) {
			page = "student/createPage";
		}
		
		return page;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// 검증할 대상의 Validator인 StudentValidator를 set한다. 
		binder.setValidator(new StudentValidator());
	}
}
