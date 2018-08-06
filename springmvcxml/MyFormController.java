package cn.peizhi.smvc;

import cn.peizhi.domain.Person;

/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年8月6日
 */

public class MyFormController extends org.springframework.web.servlet.mvc.SimpleFormController {
	public MyFormController() {
		super.setCommandClass(Person.class);		//绑定对象
	}
	
	//提交
	protected void doSubmitAction(Object command) throws Exception {
		Person p = (Person)command;
		System.out.println(p);
	}
}
