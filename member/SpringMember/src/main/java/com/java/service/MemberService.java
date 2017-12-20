package com.java.service;

import java.util.List;

import com.java.dto.MemberVO;

public interface MemberService {
	public List<MemberVO> selectMember() throws Exception;
	public void addMember(MemberVO memberVO) throws Exception;
}