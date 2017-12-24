package com.java.dao;

import java.util.List;

import com.java.dto.MemberVO;

public interface MemberDAO {
	public List<MemberVO> selectMember() throws Exception;
	public String selectOneMember(int id) throws Exception;
	public void addMember(MemberVO memberVO) throws Exception;
	public void deleteMember(MemberVO memberVO) throws Exception;
	public void updateMember(MemberVO memberVO) throws Exception;
}
