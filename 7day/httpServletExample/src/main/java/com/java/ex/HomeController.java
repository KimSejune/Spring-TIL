package com.java.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.ex.member.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/board/confirmId", method = RequestMethod.GET)
	public String confirmIdEx(HttpServletRequest httpServletRequest, Model model) {
		
		// QueryString으로 전송하는 값을 받아서 변수로 저장한다.
		String hid = httpServletRequest.getParameter("id");
		String hpw = httpServletRequest.getParameter("pw");
		
		// 위에서 생성한 변수를 model에다가 넣어준다.
		model.addAttribute("id", hid);
		model.addAttribute("pw", hpw);
		
		return "board/confirmId";
	}
	
	@RequestMapping(value="/member/memberView", method = RequestMethod.GET)
	public String viewMember(HttpServletRequest httpServletRequest, Model model) {
		String hname = httpServletRequest.getParameter("name");
		String hjob = httpServletRequest.getParameter("job");
		model.addAttribute("name", hname);
		model.addAttribute("job", hjob);
		return "member/memberView";
	}
	
	@RequestMapping(value="/board/anconfirmId", method=RequestMethod.GET)
	public String annoconfirmIdEx(@RequestParam("id") String hid, @RequestParam("pw")int hpw, Model model) {
		model.addAttribute("id", hid);
		model.addAttribute("pw", hpw);
		
		return "board/anconfirmId";
	}
	
	// 예전 방식 
	@RequestMapping(value="/member/join", method=RequestMethod.GET)
	public String joinData(@RequestParam("name") String hname, @RequestParam("id") String hid, 
			@RequestParam("pw") String hpw, @RequestParam("email") String hemail, Model model) {
		// member에다가 QueryString으로 받은 값을 넣어준다.
		Member member = new Member();
		member.setName(hname);
		member.setId(hid);
		member.setPw(hpw);
		member.setEmail(hemail);
		
		// member에 넣은값을 memberInfo라는 attribute로 생성한다.
		model.addAttribute("memberInfo", member);
		return "member/join";
	}
	
	@RequestMapping(value="/member/newjoin", method=RequestMethod.GET)
	public String newJoinData(Member member) {
		return "member/newjoin";
	}
	
	@RequestMapping(value="member/{memberId}")
	public String getMemberId(@PathVariable String memberId, Model model) {
		model.addAttribute("memberId", memberId);
		return "member/memberIdView";
	}
}
