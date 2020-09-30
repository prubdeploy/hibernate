package practice;

import OOPS1.Animal;

public class AnimalObjectsExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Animal a1 =new Animal("Dog");
		//a1.setaType("Dog");
		a1.setaGender("Male");
		a1.setaSpecies("Mammal");
		
		a1.display();
		
		
		Animal a2 =new Animal("Alligator");
		//a2.setaType("Alligator");
		a2.setaGender("Female");
		a2.setaSpecies("Reptile");
		
		a2.display();
		
		
		Animal a3 =new Animal("Owl");
		//a3.setaType("Owl");
		a3.setaGender("Female");
		a3.setaSpecies("Aves");
		
		a3.display();
		
		
		Animal a4 =new Animal("Ladybird");
		//a4.setaType("Ladybird");
		a4.setaGender("Male");
		a4.setaSpecies("Insect");
		
		a4.display();
		
		
	}

}