package cn.annotation.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//怎么访问这个方法呢？
	@RequestMapping({"/xx/home.action","/home.action"})
	public String goHome(HttpServletRequest request){
		System.out.println(request.getRequestURI());
		
		return "index";
	}
}
