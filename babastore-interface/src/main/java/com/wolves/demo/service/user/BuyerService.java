package com.wolves.demo.service.user;

import com.wolves.demo.pojo.order.Order;
import com.wolves.demo.pojo.user.Buyer;

public interface BuyerService {
	
	//通过用户名查询用户对象
	public Buyer selectBuyerByUsername(String username);
	
	//保存订单
	public void insertOrder(Order order,String username);

}
