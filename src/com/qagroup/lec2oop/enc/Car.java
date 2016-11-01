package com.qagroup.lec2oop.enc;

public class Car {
	public int speed;

	private static final int MAX_SPEED = 140;

	public Car() {
	}

	public void accelerateBy(int value) {
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
