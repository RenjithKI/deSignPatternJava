package staticbindingDynamicbinding;
import java.util.Collection;
import java.util.HashSet;

import FactoryPattern.Animal;
import FactoryPattern.Dog;

/**
 * @author Renjith
 *
 */
public class StaticBindingTest2 { 
	
	public static void callEat(Animal animal) {
	    System.out.println("Animal is eating");
	}

	public static void callEat(Dog dog) {
	    System.out.println("Dog is eating");
	}

	public static void main(String args[])
	{
	    Animal a = new Dog();
	    callEat(a);
	    
	    Dog d = new Dog();
	    callEat(d);
	}
}