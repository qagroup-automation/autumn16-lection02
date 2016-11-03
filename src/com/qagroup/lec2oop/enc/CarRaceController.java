package com.qagroup.lec2oop.enc;

public class CarRaceController {

	public static void increaseCarSpeed(Car car, int speedIncrease) {
		//car.increaseSpeedBy(speedIncrease);
		car.speed = car.speed + speedIncrease;
	}
}
