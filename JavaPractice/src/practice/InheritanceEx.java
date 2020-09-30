package practice;

import OOPS1.Inheritance.Animal;
import OOPS1.Inheritance.BabyDog;
import OOPS1.Inheritance.Cat;
import OOPS1.Inheritance.Dog;

public class InheritanceEx {

	public static void main(String[] args) {

		System.out.println("*****************Animal****************");
		Animal animal = new Animal();
		animal.eat();
		System.out.println("*****************Dog****************");
		Dog dog = new Dog();
		dog.eat();
		dog.bark();

		System.out.println("*****************BabyDog****************");
		BabyDog babydog=new BabyDog();
		babydog.eat();
		babydog.bark();
		babydog.weep();
		
		System.out.println("*****************Cat****************");
		Cat cat=new Cat();
		cat.eat();
		cat.meow();
	}

}
