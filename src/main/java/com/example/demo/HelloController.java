package com.example.demo;

import java.util.HashMap;

@RestController
public class HelloController {
	
	public String hello() {
		return "Hello";
	}
	
	@RequestMapping("/userinfo")
	HashMap<String, String> userinfo() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("age", "23");
		return map;
	}

}
