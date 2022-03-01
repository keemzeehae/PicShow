package com.keem.myapp.talk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TalkService {

	@Autowired
	private TalkDAO talkDAO;
	
	//update
	public int update(TalkDTO talkDTO) throws Exception{
		return talkDAO.update(talkDTO);
	}
	
	//list
	public List<TalkDTO> list() throws Exception{
		List<TalkDTO> ar = talkDAO.list();
		return ar;
	}
	
	//insert
	public int add(TalkDTO talkDTO) throws Exception{
		return talkDAO.add(talkDTO);
	}
	
	//detail
	public TalkDTO detail(TalkDTO talkDTO) throws Exception{
		return talkDAO.detail(talkDTO);
	}
	
	//delete
	public int delete(TalkDTO talkDTO) throws Exception{
		return talkDAO.delete(talkDTO);
	}
}
