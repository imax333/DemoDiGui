package com.atpingan;

public class DiGuiDemo {

	public static void main(String[] args) {

		int diGui = DiGui(5);
		System.out.println("  阶乘为 :" + diGui);
		System.out.println("this  is test 1 ");
		System.out.println("this is test 2 ");
		System.out.println("this is test 3 ");
	}

	public static int DiGui(int num) {
		if (num == 1) {
			return 1;
		} else {
			return DiGui(num - 1) * num;
		}
	}

	public void say(String sss) {
		System.out.println(" this is say ");
	}

	public void say() {
		System.out.println("hello ");
	}

}
