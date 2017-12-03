package com.java.newcon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class RequestController {

	@RequestMapping("/Reqview")
	public String ReqView(Model model) {
		
		model.addAttribute("id", "123123");
		
		return "/board/Reqview";
	}
}
