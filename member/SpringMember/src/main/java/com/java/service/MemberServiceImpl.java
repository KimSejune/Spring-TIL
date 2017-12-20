package com.java.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.java.dao.MemberDAO;
import com.java.dto.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO memberDAO;

	@Override
	public List<MemberVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.selectMember();
	}

	@Override
	public void addMember(MemberVO memberVO) throws Exception {
		memberDAO.addMember(memberVO);
		
	}




}