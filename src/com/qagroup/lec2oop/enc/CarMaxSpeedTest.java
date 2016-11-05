package com.qagroup.lec2oop.enc;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This test class contains test methods checking that {@code Car} objects meet
 * the following requirement: a car cannot have speed higher than maximum value
 * of 140 km/h.
 * 
 * @author Sonya
 *
 */
public class CarMaxSpeedTest {

	/*
	 * Represents a requirement that the maximum possible speed of a car is 140
	 * km/h.
	 */
	private int maxSpeed = 140;

	/**
	 * Unit test on a car. The car is interacted with via public interface
	 * (method) of {@link Car} class. Step: trying to increase the speed by the
	 * exact boundary value - the maximum speed.
	 */
	@Test
	public void testMaxSpeedExact() {
		// Create object to test
		Car car = new Car();

		// Input test data
		int increaseValue = maxSpeed;

		// Test step - accelerating the car
		car.increaseSpeedBy(increaseValue);

		// Compare the actual car speed with the maximum speed
		Assert.assertTrue(car.getSpeed() <= maxSpeed);
	}

	/**
	 * Unit test on a car. The car is interacted with via public interface
	 * (method) of {@link Car} class. Step: trying to increase the speed by the
	 * value higher than the maximum speed.
	 */
	@Test
	public void testGreaterThanMaxSpeedIncrease() {
		// Create object to test
		Car car = new Car();

		// Input test data
		int increaseValue = maxSpeed + 1;

		// Test step - accelerating the car
		car.increaseSpeedBy(increaseValue);

		// Compare the actual car speed with the maximum speed
		Assert.assertTrue(car.getSpeed() <= maxSpeed);
	}

	/**
	 * Integration test on a {@link Car} object in a more complex environment.
	 * The {@link Car} object is interacted with indirectly - it is passed to an
	 * external utility {@link CarRaceController} class. Step: trying to
	 * increase the speed by the value higher than the maximum speed.
	 */
	@Test
	public void testGreaterThanMaxSpeedIncreaseByController() {
		// Create object to test
		Car car = new Car();

		// Input test data
		int increaseValue = maxSpeed + 1;

		// Test step - accelerating the car
		CarRaceController.increaseCarSpeed(car, increaseValue);

		// Compare the actual car speed with the maximum speed
		Assert.assertTrue(car.getSpeed() <= maxSpeed,
				"Current speed of car " + car.getSpeed() + " should not be greater that max value " + maxSpeed);
	}

}
