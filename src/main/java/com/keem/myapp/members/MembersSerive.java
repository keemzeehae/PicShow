package com.keem.myapp.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersSerive {

	@Autowired
	private MembersDAO membersDAO;
	public int join(MembersDTO membersDTO) throws Exception{
		return membersDAO.join(membersDTO); 
	}
}
