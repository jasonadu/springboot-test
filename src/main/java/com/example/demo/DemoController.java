package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/test")
	public String test() {
		return "1111";
	}
	
	@RequestMapping("/testPojo")
	public @ResponseBody Pojo testPojo() {
		Pojo pojo = new Pojo();
		pojo.setAge(23);
		pojo.setName("mike");
		return pojo;
	}
}

class Pojo {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}