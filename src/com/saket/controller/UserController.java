package com.saket.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saket.entity.User;
import com.saket.service.UserFacade;
import com.saket.service.UserServiceImpl;

@Controller
public class UserController {

	@RequestMapping("/SignUp.htm")
	public ModelAndView newUser(HttpServletRequest request,
			HttpServletResponse response) {
		String user_name = request.getParameter("username");
		String password = request.getParameter("password");

		User user = new User();
		user.setUser_name(user_name);
		user.setPassword(password);
		UserFacade userServiceImpl = new UserServiceImpl();
		userServiceImpl.createUser(user);

		ModelAndView mv = new ModelAndView();
		return mv;
	}
	@RequestMapping("/Login.htm")
	public ModelAndView searchUser(HttpServletRequest request,HttpServletResponse response){
		String user_name = request.getParameter("username");
		String password = request.getParameter("password");
		User user = null;
		UserFacade userServiceImpl = new UserServiceImpl();
		user = userServiceImpl.searchUser(user_name);
		ModelAndView mv = new ModelAndView();
		if(password.equals(user.getPassword())){
			mv.addObject("status", "Login Successful");
			mv.setViewName("/Login.jsp");
			System.out.println("success");
		}
		else{
			mv.addObject("status", "Login UnSuccessful");
			mv.setViewName("/Login.jsp");
			System.out.println("unsucces");
		}
		return mv;
	}
    @RequestMapping("/change.htm")
    public ModelAndView changePassword(HttpServletRequest request,HttpServletResponse response){
    	String password = request.getParameter("password");
    	User user  = null;
    	UserFacade userServiceImpl = new UserServiceImpl();
    	user = userServiceImpl.changePassword(password);
    	
    	ModelAndView mv = new ModelAndView();
    	return mv;
    }
}
