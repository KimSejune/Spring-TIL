package com.java.re;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping( value = "/studentConfirm")
	public String studentRedirect(HttpServletRequest httpServletRequest, Model model) {
		
		String hid = httpServletRequest.getParameter("id");
		model.addAttribute("mid", hid);
		if(hid.equals("abc")) {
			return "redirect:studentOk";
		}
		
		return "redirect:studentNo";
	}
	
	@RequestMapping("/student/studentOk")
	public String studentOk() {
		return "student/studentOk";
	}
	
	@RequestMapping("/student/studentNo")
	public String studentNo() {
		return "student/studentNo";
	}
	
}
