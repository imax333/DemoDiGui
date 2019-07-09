package com.atpingan;

import java.util.HashMap;
import java.util.Map;

public class StringBufferTest {

	public static void main(String[] args) {
		
		// 不要使用 += 来连接字符串  
		String context = "";
		context += "QC";
		System.out.println("context : " + context);
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("QC");
		System.out.println("StringBuffer : " + stringBuffer);
		System.out.println(stringBuffer.equals(context));// false 
		System.out.println(stringBuffer.toString().equals(context));// true
		
		// 自定义的集合一定要赋值  再使用 
		// 否则会报   java.lang.NullPointerException 异常 
		Map<String, Object> map = null;
		map = new HashMap<>();
		
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		
		System.out.println(map); // {key1=value1, key2=value2, key3=value3}
		
	}
}
