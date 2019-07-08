package com.atpingan;

import java.io.UnsupportedEncodingException;

public class CharacterDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String ss = "河北省任丘市鄚州镇|李广二村";
		String[] split = ss.split("");
		StringBuffer stringBuffer = new StringBuffer();
		
		for (int i = 0; i < split.length; i++) {
			if("|".equals(split[i])) {
				split[i] = "&#124";
				stringBuffer.append(split[i]);
			}else {
				stringBuffer.append(split[i]);
			}
		}
		System.out.println("1 :" + ss);
		
		String s2 = new String(stringBuffer);
		System.out.println("2 :" +s2 );
		
		
		byte[] bytes = s2.getBytes("utf-8");
		
		for (int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i] + " ");
		}
		System.out.println();
		String string = new String(bytes, "utf-8");
		System.out.println("3 "+ string);
		
		
		
		
		
		
		
		
	}
}
