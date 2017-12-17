package com.java.bo.command;



import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.java.bo.dao.BDao;
import com.java.bo.dto.BDto;

@Service
public class BListCommand implements BCommand {

	@Inject
	private BDao dao;
	// DB에 있는 데이터를 가져와서 뿌려줘야한다.
	@Override
	public void execute(Model model) throws Exception {
		// TODO Auto-generated method stub
		// dao에서 list
		
		List<BDto> dtos = dao.Blist();
		model.addAttribute("lists", dtos);
	}

}
