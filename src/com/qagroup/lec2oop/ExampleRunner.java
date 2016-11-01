package com.qagroup.lec2oop;

import java.util.Arrays;
import java.util.List;

public class ExampleRunner {
	public static void main(String[] args) {
		Animal animal = new Animal("Dog");
		animal.giveVoice();
		animal.move();

		Animal sharkAnimal = new Animal("Shark");
		sharkAnimal.giveVoice();
		sharkAnimal.move();

		System.out.println();

		Dog dog = new Dog();
		dog.giveVoice();
		dog.move();

		System.out.println();

		Duck duck = new Duck();
		duck.giveVoice();
		duck.move();

		System.out.println();

		Shark shark = new Shark();
		shark.giveVoice();
		shark.move();

		// Dog dogShark = new Shark();
		Animal someAnimal = new Shark();
		someAnimal.move();

		someAnimal = new Dog();
		someAnimal.move();

		someAnimal = new Duck();
		someAnimal.move();
		
		
		someAnimal = new Cat();
//		someAnimal.catchMouse();

		Cat cat = new Cat();
		cat.catchMouse();
		
		
		
		Object object = new Cat();
		
		
		
		
		
		
		
		
		
		
		
		List<Animal> animals = getSomeAnimals();
		System.out.println();
		System.out.println("OUR ANIMALS");
		System.out.println();
		
		for(Animal something : animals) {
			something.giveVoice();
		}
	}

	public static List<Animal> getSomeAnimals() {
		List<Animal> animals = Arrays.asList(new Dog(), new Shark(), new Duck(), new Shark(), new Cat(), new Dog());
		return animals;
	}

}
