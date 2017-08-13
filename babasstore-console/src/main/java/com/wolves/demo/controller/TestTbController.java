package com.wolves.demo.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolves.demo.pojo.TestTb;
import com.wolves.demo.service.TestTbService;

@Controller
public class TestTbController {
	@Resource
	private TestTbService testTbService;
	@RequestMapping("/index.do")
	public String index() {
		int i = 1_1;
		System.out.println(i);
		TestTb tb = new TestTb();
		tb.setBirthday(new Date());
		tb.setName("梁陈燕");
		testTbService.addTestTb(tb);
		return "index";
	}
	
	//top
	@RequestMapping(value = "/top.do")
	public String top(){
		return "top";
	}
	//main
	@RequestMapping(value = "/main.do")
	public String main(){
		return "main";
	}
	//left
	@RequestMapping(value = "/left.do")
	public String left(){
		return "left";
	}
	//right
	@RequestMapping(value = "/right.do")
	public String right(){
		return "right";
	}

	//商品 身体
	@RequestMapping(value = "/frame/product_main.do")
	public String product_main(){
		return "frame/product_main";
	}
	//商品 身体 左
	@RequestMapping(value = "/frame/product_left.do")
	public String product_left(){
		return "frame/product_left";
	}
	//订单 身体
	@RequestMapping(value = "/frame/order_main.do")
	public String order_main(){
		return "frame/order_main";
	}
	//订单 身体 左
	@RequestMapping(value = "/frame/order_left.do")
	public String order_left(){
		return "frame/order_left";
	}

}
