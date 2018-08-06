package cn.peizhi.smvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年8月6日
 */

public class HiController extends AbstractController{

	protected ModelAndView handleRequestInternal(HttpServletRequest reqeust,
			HttpServletResponse response) throws Exception {
		
		//打印出访问的名字
		System.out.println("HiController: "+reqeust.getRequestURI());
		
		return new ModelAndView("index");	//逻辑名
	}
	
}