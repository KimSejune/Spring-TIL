package com.java.bo.controller;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.bo.command.BCommand;
import com.java.bo.command.BContentCommand;
import com.java.bo.command.BDeleteCommand;
import com.java.bo.command.BListCommand;
import com.java.bo.command.BModifyCommand;
import com.java.bo.command.BReplyViewCommand;
import com.java.bo.command.BWriteCommand;

@Controller
public class BController {

	// 초기화가 아닌 생성만 해주고 각자의 초기화는 해당 method안에서 한다.
	@Inject
	BCommand command;
	
	// list를 보여준다.
	@RequestMapping(value= "/list", method = RequestMethod.GET )
	public String list(Locale locale, Model model) throws Exception {
	
		System.out.println("list method start!!!!!!");
		// BListCommand에게 작업을 시켜야한다.
		command = new BListCommand();
		command.execute(model);
		
		return "list";
	}
	
	// 작성화면 (동작이아니라서 호출만한다.)
	@RequestMapping(value="/write_view", method = RequestMethod.GET )
	public String writeView(Model model) {
		System.out.println("write view method start!!!!!!");
		
		return "write_view";
	}
	
	// 실제작성 (동작)
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public String write(HttpServletRequest httpServletRequset, Model model) throws Exception {
		System.out.println("write (동작) method start!!!!!!");
		
		model.addAttribute("req", httpServletRequset);
		command = new BWriteCommand();
		command.execute(model);
		
		// 완성 후 list 페이지로 가줘야한다.
		return "redirect:list";
	}
	
	// content를 본다.
	@RequestMapping(value="/content_view", method = RequestMethod.GET)
	public String contentView(HttpServletRequest httpServletRequest, Model model) throws Exception {
		System.out.println("content view method start!!!!!!");
		
		model.addAttribute("req", httpServletRequest);
		command = new BContentCommand();
		command.execute(model);
		return "content_view";
	}
	
	// 수정
	@RequestMapping(value="/modify", method = RequestMethod.POST )
	public String modify(HttpServletRequest httpServletRequest, Model model) throws Exception {
		System.out.println("modify view method start!!!!!!");
		model.addAttribute("req", httpServletRequest);
		command = new BModifyCommand();
		command.execute(model);
		
		// 수정 후 list 페이지로 간다.
		return "redirect:list";
	}
	
	// 답변보는것
	@RequestMapping(value="/reply_view", method = RequestMethod.GET )
	public String replyView(HttpServletRequest httpServletRequest, Model model) throws Exception {
		System.out.println("reply view method start!!!!!!");
		
		model.addAttribute("req", httpServletRequest);
		command = new BReplyViewCommand();
		command.execute(model);
		return "reply_view";
	}
	
	// 답변작성기능 
	@RequestMapping(value="/replay", method = RequestMethod.GET )
	public String reply(HttpServletRequest httpServletRequest, Model model) throws Exception {
		System.out.println("reply method start!!!!!!");
		
		model.addAttribute("req", httpServletRequest);
		command = new BReplyViewCommand();
		command.execute(model);
		return "redirect:list";
	}
	
	// 삭제
	@RequestMapping(value="/delete", method = RequestMethod.GET )
	public String delete(HttpServletRequest httpServletRequest, Model model) throws Exception {
		System.out.println("delete method start!!!!!!");
		model.addAttribute("req", httpServletRequest);
		command = new BDeleteCommand();
		command.execute(model);
		return "redirect:list";
	}
}
