package com.java.dao;

import java.util.List;

import com.java.dto.MemberVO;

public interface MemberDAO {
	public List<MemberVO> selectMember() throws Exception;
	public void addMember(MemberVO memberVO) throws Exception;
}