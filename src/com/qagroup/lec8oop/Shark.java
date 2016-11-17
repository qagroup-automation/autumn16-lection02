package com.qagroup.lec8oop;

public class Shark implements Animal {

	@Override
	public void move() {
		System.out.println("Swim");
	}

	@Override
	public void giveVoice() {
		System.out.println("Silence");
	}

	@Override
	public String getName() {
		return "Shark";
	}

}
