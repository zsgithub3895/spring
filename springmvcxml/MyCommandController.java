package cn.peizhi.smvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import cn.peizhi.domain.Person;

/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年8月6日
 */

public class MyCommandController extends AbstractCommandController {
	//绑定，在默认构造方法中设置
	public MyCommandController() {
		super.setCommandClass(Person.class);
	}
	
	protected ModelAndView handle(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		Person p = (Person) command;	//让框架认识command是person，绑定
		System.out.println(p);
		
		return new ModelAndView("index");
	}

}
