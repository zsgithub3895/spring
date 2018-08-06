package cn.annotation.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.annotation.domain.Person;

@Service
public class PersonService {
	//提供人员名单，10个人
	private static Integer id = 0;
	static Map<Integer,Person> map = new HashMap<Integer,Person>();
	//初始化10个人
	static{
		for(int i=0;i<10;i++){
			Person p = new Person();
			p.setId(id++);
			p.setName("tony"+i);
			p.setAge(10+i);
			
			map.put(i, p);		//存储人员信息
		}
	}
	
	//查询所有
	public List<Person> list(){
		return new ArrayList(map.values());
	}
	
	//新增
	public void insert(Person p){
		p.setId(id++);
		map.put(p.getId(), p);
	}
}
