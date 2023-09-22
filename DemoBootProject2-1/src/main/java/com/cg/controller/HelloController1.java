package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloController1 {
	@RequestMapping("/hello1")
	@ResponseBody
	public String sayHello() {
		return "Hello everybody from hello1";
		
	}
}
