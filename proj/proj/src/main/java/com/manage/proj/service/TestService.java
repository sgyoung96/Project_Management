package com.manage.proj.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.proj.dao.TestDao;

@Service("TestService")
public class TestService {

	@Autowired
	TestDao dao;
	
	public HashMap<String, Object> getDualTable() {
		return dao.selectDualTable();
	}
}