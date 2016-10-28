package com.qagroup.basicjava;

public class TestSimpleJavaSyntax {

	public static void main(String[] args) {
		System.out.println("Hello Automated World!");

		int x = 200;
		double dn = 200.01;
		String str = "Hello";
		String strObj = new String("Hello");
		String strObj2 = new String("Hello");
		boolean bool = false;

		System.out.println(1 == 2);
		// System.out.println(1 == false);

		Car car = new Car();

		Integer x2 = new Integer(200);
		x = new Integer(22);
		x2 = 22;

		int[] xArr = new int[] { 1, 2, 3 };
		int[] xArr2 = { 2, 4, 6, 8 };
		int[] xArr3 = new int[5];

		Car[] cars = new Car[3];

		System.out.println(cars == null);
		boolean result = cars == null;
		System.out.println(result);

		for (int i = 0; i < cars.length; i++)
			System.out.println(i + " - " + cars[i]);

		for (int j = 0; j < cars.length; j++)
			cars[j] = new Car();

		for (int i = 0; i < cars.length; i++)
			System.out.println(i + " - " + cars[i]);
		
		cars[3] = new Car();
		
		System.out.println("GOOD!");
	}
}
