package com.wolves.demo.test;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wolves.demo.pojo.TestTb;
import com.wolves.demo.service.TestTbService;

public class TestTbDaoUnitTest extends BaseUnitTest {
	Logger logger = Logger.getLogger(TestTbDaoUnitTest.class);
	@Autowired
	private TestTbService service;
	@Test
	public void testAdd() {
		logger.info("start!!!");
		TestTb testTb = new TestTb();
		testTb.setBirthday(new Date());
		testTb.setName("顶顶顶");
		service.addTestTb(testTb );
	}
}
