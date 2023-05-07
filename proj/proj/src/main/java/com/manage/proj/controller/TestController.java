package com.manage.proj.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.manage.proj.service.TestService;

@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping(value="/test")
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("/test/test");
		
		System.out.println("TEST SUCCESS!");
		
		return mv;
	}
	
	@Transactional(readOnly = true)
	@ResponseBody
	@RequestMapping(value="connectionTest")
	public Object connectionTest(HttpServletRequest request, HttpServletResponse response, @RequestBody HashMap<String, Object> param) {
		// 결과값 화면으로 리턴할 변수
		HashMap<String, Object> resParam = new HashMap<String, Object>();
		
		try {
			HashMap<String, Object> resData = new HashMap<String, Object>();
			resData = testService.getDualTable();
			System.out.println("resData : " + resData.get("TEST"));
			
		} catch (Exception e) {
			e.printStackTrace();
			resParam.put("RES_CD", "999");
			resParam.put("RES_MSG", "오류");
			return resParam;
		}
		return resParam;
	}
}
