package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@RequestMapping("/test2")
	public String test2() {
		return "test2";
	}
	
	
}


