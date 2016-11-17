package com.qagroup.lec8oop;

public class Duck implements Animal {

	@Override
	public void move() {
		System.out.println("Fly");

	}

	@Override
	public void giveVoice() {
		System.out.println("Krya");
	}

	@Override
	public String getName() {
		return "Duck";
	}

}
