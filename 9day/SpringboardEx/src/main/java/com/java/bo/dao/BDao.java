package com.java.bo.dao;

import java.util.ArrayList;

import com.java.bo.dto.BDto;

// DB에 접근하여 작업을한다. 
public class BDao {

	// DB에서 list에 접근하여 가져온다 여러개가 배열형태로 저장되어있다. 
	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		return dtos;
	}
}
