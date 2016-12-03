package com.qagroup.lec2oop.enc;

public class Car {
	public int speed;

	public static final int MAX_SPEED = 140;

	public Car() {
		System.out.println("CAR HAS BEEN CREATED");
	}

	public Car(int initialSpeed) {
		System.out.println("CAR HAS BEEN CREATED WITH INITIAL SPEED " + initialSpeed);
		this.speed = initialSpeed;
	}

	public void increaseSpeedBy(int value) {
		if (MAX_SPEED < this.speed + value) {
			this.speed = MAX_SPEED;
		} else {
			this.speed = this.speed + value;
		}
	}

	public int getSpeed() {
		return this.speed;
	}

}
