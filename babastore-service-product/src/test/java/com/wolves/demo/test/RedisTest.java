package com.wolves.demo.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.Jedis;

public class RedisTest extends BaseUnitTest{
	@Autowired
	private Jedis jedis;
	@Test
	public void redisTest() {
//		Jedis jedis = new Jedis("192.168.244.129",6379);
		String incr = jedis.set("huwf", "520");
		System.out.println(incr);
//		jedis.close();
	}
}
