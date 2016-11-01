package com.qagroup.lec2oop.enc;

public class ExampleRunner2 {


	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.getSpeed());
		
		car.accelerateBy(90);
		System.out.println(car.getSpeed());
		
		car.accelerateBy(90);
		System.out.println(car.getSpeed());
		
		car.accelerateBy(90);
		System.out.println(car.getSpeed());
		
		car.accelerateBy(160);
		System.out.println(car.getSpeed());
		
		if(car.getSpeed() > 120)
			car.speed = 120;
		System.out.println(car.speed);
		
//		car.speed = car.speed + 90;
//		System.out.println(car.getSpeed());
//		
//		car.speed = car.speed + 90;
//		System.out.println(car.getSpeed());
	}
}
