package com.manage.proj.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manage.proj.service.TestService;

@RestController
@RequestMapping("/api")
public class FrontTestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/data")
	public HashMap<String, Object> test() {
		System.out.println(testService.getDualTable());
		return testService.getDualTable();
	}
}
