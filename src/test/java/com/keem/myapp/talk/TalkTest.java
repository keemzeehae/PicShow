package com.keem.myapp.talk;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.keem.myapp.MyJunitTest;
import com.keem.myapp.util.Pager;

public class TalkTest extends MyJunitTest{

	@Autowired
	private TalkDAO talkDAO;
	
	@Test
	public void list() throws Exception{
		Pager pager = new Pager();
		pager.makeRow();
		List<TalkDTO> ar = talkDAO.list(pager);
		System.out.println(ar.get(0).getNum());
		System.out.println(ar.get(9).getNum());
		assertEquals(10, ar.size());
	}
	//@Test
	public void add() throws Exception{
		for(int i=0;i<200;i++) {
			TalkDTO talkDTO = new TalkDTO();
			talkDTO.setTitle("talk"+i);
			talkDTO.setContents("contents"+i);
			talkDTO.setWriter("writer"+i);
			talkDTO.setHit(0L);
			
			int result=talkDAO.add(talkDTO);
			if(i%10==0) {
				Thread.sleep(1000); 
			}
		}
		System.out.println("Insert done");
	}
	
	
	//@Test
	public void detail() throws Exception{
		TalkDTO talkDTO= new TalkDTO();
		talkDTO.setNum(1L);
		talkDTO=talkDAO.detail(talkDTO);
		assertNotNull(talkDTO);
	}
}
