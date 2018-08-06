package cn.peizhi.smvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @Description: 第一个Cotroller，转向index.jsp
 * @Author:	tony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年8月3日
 */

public class HomeController extends AbstractController{

	protected ModelAndView handleRequestInternal(HttpServletRequest reqeust,
			HttpServletResponse response) throws Exception {
		
		//打印出访问的名字
		System.out.println("HomeController: "+reqeust.getRequestURI());
		
		return new ModelAndView("index");	//逻辑名
	}
	
}
