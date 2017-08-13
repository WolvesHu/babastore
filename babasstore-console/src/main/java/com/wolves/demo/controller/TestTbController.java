package com.wolves.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolves.demo.pojo.TestTb;
import com.wolves.demo.service.TestTbService;

@Controller
public class TestTbController {
	private TestTbService testTbService;
	@RequestMapping("/index.do")
	public String index() {
		int i = 1_1;
		System.out.println(i);
		TestTb tb = new TestTb();
		tb.setBirthday(new Date());
		tb.setName("梁陈燕");
		testTbService.addTestTb(tb);
		return "/index.jsp";
	}
}
