package com.java.bo.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
// 실제로 게시판을 보는 command이다.
public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		// model에서 map형식으로 값을 구하게하는 설정 
		Map<String, Object> map = model.asMap();
		
		// req는 list에서 가져온 것을 나타낸다!!  
		HttpServletRequest httpServletRequest = (HttpServletRequest) map.get("req");
		
		String bId = httpServletRequest.getParameter("bId");
		
	
		
	}

}
