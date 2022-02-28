package com.keem.myapp.talk;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.keem.myapp.MyJunitTest;

public class TalkTest extends MyJunitTest{

	@Autowired
	private TalkDAO talkDAO;
	
	@Test
	public void list() throws Exception{
		List<TalkDTO> ar = talkDAO.list();
		assertEquals(1, ar.size());
	}
}
