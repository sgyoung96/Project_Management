package com.manage.proj.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("TestDao")
public class TestDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public HashMap<String, Object> selectDualTable() {
		
		HashMap<String, String> dataMap = new HashMap<String, String>(); // 빈값 할당 (듀얼 테이블 테스트 용이므로 파라미터 필요 없음)
		ArrayList<Object> queryResult = new ArrayList<Object>();
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		queryResult = (ArrayList<Object>) sqlSession.selectList("selectTest.kosta", dataMap);
		System.out.println("queryResult : " + queryResult.toString());
		
		//Object rs = sqlSession.selectList("selectTest.kosta", dataMap);
		//System.out.println("rs : " + rs.toString());
		
		result.put("result", queryResult);
		
//		return (HashMap<String, Object>) sqlSession.selectList("login.selectLoginInfo", dataMap);
		return result;
	}
}
