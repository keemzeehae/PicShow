package com.keem.myapp.talk;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TalkDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.keem.myapp.talk.TalkDAO.";
	
	//list
	public List<TalkDTO> list() throws Exception {
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	//insert
	public int add(TalkDTO talkDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"add",talkDTO);
	}
	
	//detail
	public TalkDTO detail(TalkDTO talkDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail",talkDTO);
	}
}
