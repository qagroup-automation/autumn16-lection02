package com.qagroup.lec2oop.enc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarMaxSpeedTest {

	private int maxSpeed = 140;

	@Test
	public void testMaxSpeedExact() {
		Car car = new Car();
		int increaseValue = maxSpeed;

		car.increaseSpeedBy(increaseValue);

		Assert.assertTrue(car.getSpeed() <= maxSpeed);
	}

	@Test
	public void testGreaterThanMaxSpeedIncrease() {
		Car car = new Car();
		int increaseValue = maxSpeed + 1;

		car.increaseSpeedBy(increaseValue);

		Assert.assertTrue(car.getSpeed() <= maxSpeed);
	}

	@Test
	public void testGreaterThanMaxSpeedIncreaseByController() {
		Car car = new Car();
		int increaseValue = maxSpeed + 1;

		CarRaceController.increaseCarSpeed(car, increaseValue);

		Assert.assertTrue(car.getSpeed() <= maxSpeed,
				"Current speed of car " + car.getSpeed() + " should not be greater that max value " + maxSpeed);
	}

}
