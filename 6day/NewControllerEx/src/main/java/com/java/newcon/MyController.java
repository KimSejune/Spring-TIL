package com.java.newcon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/myview")
	public String myview() {
		return "myview";
	}
	
	@RequestMapping("/content/contentView")
	public String contentView(Model model) {
		
		model.addAttribute("name", "Sejune Kim");
		model.addAttribute("age", 25);	
		return "content/contentView";
	}
	
	@RequestMapping("/model/modelExample")
	public String modelExample(Model model) {
		
		model.addAttribute("job", "dev");
		
		return "model/modelExample";
	}
	
	
	@RequestMapping("/modelAndView/ex")
	public ModelAndView modelAndView() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("hobby", "coding");
		mv.setViewName("/modelAndView/ex");
		return mv;
	}
}
