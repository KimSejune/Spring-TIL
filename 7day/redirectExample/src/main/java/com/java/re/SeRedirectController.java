package com.java.re;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SeRedirectController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String indexView() {

		return "index";
	}
	
	@RequestMapping(value="/student/studentCheck", method=RequestMethod.POST)
	public String studentCheckView(StudentInfo studentInfo) {
		if(studentInfo.id.equals("tpwns") && studentInfo.pw.equals("123")) {
			return "student/studentCheck";
		}
		return "redirect:../index";
	}
}
