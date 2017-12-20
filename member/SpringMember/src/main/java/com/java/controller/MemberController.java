package com.java.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.dto.MemberVO;
import com.java.service.MemberService;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	private MemberService memberService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET )
	public String list(Model model) throws Exception {
		logger.info("list");
	
		List<MemberVO> memberList = memberService.selectMember();
	
		model.addAttribute("memberList", memberList);
		return "list";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST )
	public String add(MemberVO memberVO) throws Exception {
		
		memberService.addMember(memberVO);
		return "redirect:list";
	}
}