package FactoryPattern;

public class FactoryPatternAnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalFactory af = new AnimalFactory();
		Animal a1 = af.createAnimal("DOG");
		
		Animal a2 = af.createAnimal("CAT");
		
		Animal a3 = af.createAnimal("DUCK");		
		a3.eat();
		a2.eat();
		a1.eat();
	}

}
