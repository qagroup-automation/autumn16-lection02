package com.qagroup.lec2oop;

public class Cat extends Animal {

	public Cat() {
		super("Cat");
	}
	
	public void catchMouse() {
		System.out.println("I have cought a mouse!!!");
	}
	
	
	@Override
	public void move(){
		System.out.println(getName() + " can run!");
	}
	
	
	public void giveVoice() {
		System.out.println(getName() + " can myau!");
	}

}
