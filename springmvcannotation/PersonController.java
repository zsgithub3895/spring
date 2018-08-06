package cn.annotation.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.annotation.service.PersonService;
import cn.annotation.domain.Person;

@Controller
public class PersonController {
	@Resource
	PersonService personService;
	
	//查询
	@RequestMapping("/person/list.action")			//访问路径
	public String list(Model model){
		List<Person> dataList = personService.list();
		model.addAttribute("dataList", dataList);	//将集合传递给页面
		
		return "/person/jPersonList";
	}
	
	//转向新增页面
	@RequestMapping("/person/tocreate.action")
	public String tocreate(){
		return "/person/jPersonCreate";			
	}
	
	//新增保存
	@RequestMapping("/person/insert.action")
	public String insert(Person p){
		personService.insert(p);
		return "redirect:/person/list.action";		//返回列表页面
	}
}
