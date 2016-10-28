package com.qagroup.basicjava;

public class Car {

	private static int counter = 0;

	public static int numberOfCars() {
		return counter;
	}

	public Car() {
		counter++;
	}

	private int availablePetrol;

	public void setInitPetrol(int initialVolume) {
		this.availablePetrol = initialVolume;
		System.out.println("Initial volume of petrol: " + initialVolume);
	}

	public void go() {
		System.out.println("START");
	}

	public void consumePetrol(int volumeInLbs) {
		System.out.println("I have consumed " + volumeInLbs + " of petrol!");
		if (availablePetrol < volumeInLbs)
			throw new RuntimeException(
					"\nCannot consume " + volumeInLbs + " of petrol.\nAvailable petrol is " + getAvailablePetrol());

		availablePetrol = availablePetrol - volumeInLbs;
	}

	public int getAvailablePetrol() {
		return this.availablePetrol;
	}

	public static void main(String[] args) {
		int initNumber = Car.numberOfCars();
		System.out.println("INIT: " + initNumber);
		
		Car car = new Car();

		car.setInitPetrol(140);
		car.go();
		car.consumePetrol(50);

		int finalPetrol = car.getAvailablePetrol();
		System.out.println("FINAL PETROL: " + finalPetrol);
		
		new Car();
		new Car();
		
		int finalNumber = Car.numberOfCars();
		System.out.println("FINAL: " + finalNumber);

//		car.consumePetrol(160);
	}
}
