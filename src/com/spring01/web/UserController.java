package com.spring01.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView login(String username, String passwd){
		if(this.checkParams(username, passwd)){
			ModelAndView mv = new ModelAndView("success");
			mv.addObject("username", username);
			mv.addObject("password", passwd);
			return mv;
		}
		return new ModelAndView("home");
	}
	
	private boolean checkParams(String username,String passwd){
		if(username.equals("��С��") && passwd.equals("1234"))
			return true;
		return false;
	}
}
