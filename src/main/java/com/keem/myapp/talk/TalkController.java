package com.keem.myapp.talk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TalkController {

	@Autowired
	private TalkService talkService;
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(TalkDTO talkDTO) throws Exception{
		int result=talkService.add(talkDTO);
		return "redirect:./list";
	}
	
	//detail
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public ModelAndView detail(ModelAndView mv,TalkDTO talkDTO) throws Exception{
		talkDTO=talkService.detail(talkDTO);
		mv.addObject("talk",talkDTO);
		mv.setViewName("talk/detail");
		return mv;
		
	}
	
	//insert
	@RequestMapping(value="add",method=RequestMethod.GET)
	public void add() throws Exception{
		
	}
	
	
	//list
	@RequestMapping(value="list",method=RequestMethod.GET)
	public ModelAndView list (ModelAndView mv) throws Exception{
		List<TalkDTO> ar = talkService.list();
		
		mv.addObject("list",ar);
		mv.setViewName("talk/list");
		return mv;
	}
}
