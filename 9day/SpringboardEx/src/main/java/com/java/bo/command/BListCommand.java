package com.java.bo.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.java.bo.dao.BDao;
import com.java.bo.dto.BDto;

public class BListCommand implements BCommand {

	// DB에 있는 데이터를 가져와서 뿌려줘야한다.
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		BDao dao = new BDao();
		// dao에서 list
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("lists", dtos);
	}

}
