package com.wolves.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wolves.demo.dao.TestTbDao;
import com.wolves.demo.pojo.TestTb;
import com.wolves.demo.service.TestTbService;


/**
 * @author lx
 *
 */
@Service("testTbService")
@Transactional
public class TestTbServiceImpl implements TestTbService {

	@Autowired
	private TestTbDao testTbDao;
	public void addTestTb(TestTb testTb){
		testTbDao.insertTestTb(testTb);
	}
	
}
