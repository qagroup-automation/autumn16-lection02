package com.qagroup.lec5;

import com.qagroup.lec2oop.enc.BMW;
import com.qagroup.lec2oop.enc.Car;

public class ObjectsManiplationExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		Car car2 = car1;
		
		System.out.println("Car 1 init speed: " + car1.getSpeed());
		System.out.println("Car 2 init speed: " + car2.getSpeed());
		
		car2.increaseSpeedBy(50);
		
		System.out.println("Car 1 final speed: " + car1.getSpeed());
		System.out.println("Car 2 final speed: " + car2.getSpeed());
		
		int a = 2;
		int b = a;
		
		System.out.println("a init: " + a);
		System.out.println("b init: " + b);
		
		b = b + 1;
		
		System.out.println("a final: " + a);
		System.out.println("b final: " + b);
		
		car2 = new Car(22);
		
		car2 = new BMW();
	
	}
}
