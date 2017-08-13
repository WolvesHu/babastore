package com.wolves.demo.test;

import java.util.ArrayList;
import java.util.List;

import com.sun.tools.javac.util.ByteBuffer;

public class JvmBasicDataType {
	
	public static void main(String[] args) {
//		byte[] b = null;
//		List<byte[]> list = new ArrayList<byte[]>();
//		for (int i = 0; i < 1024; i++) {		
//			b = new byte[20*1024*1024];
//			list.add(b);
//		}
//		System.out.println(b);
//		System.out.println("xmx="+Runtime.getRuntime().maxMemory()/1024.0/1024+"M");
//		System.out.println("free="+Runtime.getRuntime().freeMemory()/1024.0/1024+"M");
//		System.out.println("total="+Runtime.getRuntime().totalMemory()/1024.0/1024+"M");
		
		//如何减轻GC压力
		//1、软件如何设计架构
		//2、代码如何写
		//3、堆空间如何分配
		
		
//		HelloLoader l = new HelloLoader();
//		l.print();
		
		for (int i = 0; i <1024; i++) {
			java.nio.ByteBuffer.allocateDirect(1024*1024);
			System.gc();
		}
		
	}
		
}

class HelloLoader{
	public void print() {
		System.out.println("ddddddddddddddd");
	}
}