package com.java.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.dto.MemberVO;

@Repository
public class MemberDAOImp implements MemberDAO {

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.java.mapper.memberMapper";
	
	@Override
	public List<MemberVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace+".selectMember");
	}
	
	
	@Override
	public String selectOneMember(int id) throws Exception {
		return sqlSession.selectOne(Namespace+".selectOneMember", id);
	}


	@Override
	public void addMember(MemberVO memberVO) throws Exception {
		sqlSession.insert(Namespace+".addMember", memberVO);
		
	}

	@Override
	public void deleteMember(MemberVO memberVO) throws Exception {
		sqlSession.delete(Namespace+".deleteMember", memberVO);
		
	}

	@Override
	public void updateMember(MemberVO memberVO) throws Exception {
		sqlSession.update(Namespace+".updateMember", memberVO);
		
	}

	


}
