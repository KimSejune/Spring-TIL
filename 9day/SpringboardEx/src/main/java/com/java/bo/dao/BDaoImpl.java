package com.java.bo.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.java.bo.dto.BDto;

@Repository
public class BDaoImpl implements BDao {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.java.mapper.boardMapper";
	
	@Override
	public List<BDto> Blist() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace+".Blist");
	}

}
