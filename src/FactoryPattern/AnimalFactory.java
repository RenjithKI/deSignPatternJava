package FactoryPattern;

public class AnimalFactory {
	
		public Animal createAnimal(String animal){
		//String aml =animal;
		if (animal.equals("CAT")){		
			return new cat();			 		}
		else if (animal.equals("DOG")){	
			return new Dog();		
		}
		else if (animal.equals("DUCK")){			
			return new Duck();			
		}
		return null;
			
	}
	
	}


