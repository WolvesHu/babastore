package com.wolves.demo.service.user;

public interface SessionProvider {
	
	
	//先行提供接口
	//保存用户名到Redis中
	public void setAttribuerForUsername(String name,String value);
	
	//取用户名从Redis中
	public String getAttributeForUsername(String name);
	
	//验证码
	
	//退出登陆
	
	

}
