package com.manage.proj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontTestController {
	
	@RequestMapping(value="/hello")
	public String test() {
		return "hello react!!";
	}
}
