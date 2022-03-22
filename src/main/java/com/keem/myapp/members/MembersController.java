package com.keem.myapp.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/members/*")
public class MembersController {

	@Autowired
	private MembersSerive membersSerive;
	
	@RequestMapping(value="join",method=RequestMethod.POST)
	public String join(MembersDTO membersDTO) throws Exception{
		int result= membersSerive.join(membersDTO);
		return "redirect:../";
	}
	
	@RequestMapping(value="join",method=RequestMethod.GET)
	public void join() throws Exception{
		
	}
}
