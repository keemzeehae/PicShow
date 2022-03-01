package com.keem.myapp.talk;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.keem.myapp.util.Pager;

@Repository
public class TalkDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.keem.myapp.talk.TalkDAO.";
	
	//total count
	public Long total(Pager pager) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"total",pager);
	}
	
	//update 
	public int update(TalkDTO talkDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"update",talkDTO);
	}
	
	//list
	public List<TalkDTO> list(Pager pager) throws Exception {
		return sqlSession.selectList(NAMESPACE+"list",pager);
	}
	
	//insert
	public int add(TalkDTO talkDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"add",talkDTO);
	}
	
	//detail
	public TalkDTO detail(TalkDTO talkDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail",talkDTO);
	}
	//delete
	public int delete(TalkDTO talkDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"delete",talkDTO);
	}
}
