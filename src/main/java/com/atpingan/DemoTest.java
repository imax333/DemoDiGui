package com.atpingan;

import java.io.UnsupportedEncodingException;

public class DemoTest {

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
		
		String string2 = new String(stringBuffer);
		System.out.println("1 :" + string2);
		

		byte[] bytes = ss.getBytes("GBK");
		// 如果字符串含“|” 则转义为&#124
		for (int i = 0; i < bytes.length; i++) {

			System.out.print(bytes[i] + " ");
		}

		String string = new String(bytes, "utf-8");
		System.out.println(string);

		System.out.println("--------------------");
		// String str = "你好，世界";
		// System.out.println("字符串长度:"+str.length());
		//
		// byte[] utfBytes = str.getBytes("utf-8");
		// System.out.println("utf-8需要"+utfBytes.length+"字节存储");
		//
		// byte[] gbkBytes = str.getBytes("gbk");
		// System.out.println("gbk需要"+gbkBytes.length+"字节存储");

		System.out.println("-----------");
		String str = "鄚";

		byte[] utfBytes = str.getBytes("utf-8");
		for (byte utfByte : utfBytes) {
			// 字节对应的十进制是负数，因java中的二进制使用补码表示的，此处使用0xff 还原成int表示的数据，再转化成16进制
			System.out.print(Integer.toHexString((utfByte & 0xFF)) + ",");
		}
		System.out.println();
		String utf2gbkStr = new String(str.getBytes("utf-8"), "gbk");
		System.out.println("utf-8转化成gbk:" + utf2gbkStr);

		byte[] gbkBytes = utf2gbkStr.getBytes("gbk");
		for (byte gbkByte : gbkBytes) {
			System.out.print(Integer.toHexString((gbkByte & 0xFF)) + ",");
		}

		System.out.println();
		String gbk2utfStr = new String(utf2gbkStr.getBytes("gbk"), "utf-8");
		System.out.println("gbk转化成utf-8:" + gbk2utfStr);
	}

}
