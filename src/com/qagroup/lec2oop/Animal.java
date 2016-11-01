package com.qagroup.lec2oop;

public class Animal {
	private String name;

	protected Animal(String name) {
		this.name = name;
		System.out.println("Created " + this.name);
	}

	public void move() {
		System.out.println(this.name + " can move!");
	}

	public void giveVoice() {
		System.out.println(this.name + " can make sound!");
	}

	public String getName() {
		return this.name;
	}
}
