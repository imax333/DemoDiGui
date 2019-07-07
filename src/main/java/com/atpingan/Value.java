package com.atpingan;


public class Value {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setAge(18);
		
		System.out.println("1 " + person);
		
		new ValueTest().test(person);
		System.out.println("3 "+person);
		System.out.println("name is :" + person.getName() +", id is :" + person.getId());

	}
	
	
//	
//	private void test(Person person) {
//		System.out.println("2 " + person);
//		person.setName("MQ");
//	}
}
