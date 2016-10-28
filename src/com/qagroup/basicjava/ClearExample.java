package com.qagroup.basicjava;

public class ClearExample {

	public static void main(String[] args) {
//		Car[] cars = {new Car(), null, null, new Car()};
//		
//		int i = 0;
//		while(i < cars.length) {
//			System.out.println(cars[i++]);
//		}
		
		String str = "Hello Automation!";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
		System.out.println(str.split(" ").length);
		
		String str1 = "Hello";
		String str2 = "Hello1";
		String str3 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
	}
}
