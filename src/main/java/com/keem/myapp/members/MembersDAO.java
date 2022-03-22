package com.keem.myapp.members;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MembersDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.keem.myapp.members.MembersDAO.";
	
	public int join(MembersDTO membersDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"join",membersDTO);
	}
}
