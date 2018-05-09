package AbstractFactoryCreationPattern;

public class Circle implements Shape, Color {

	   @Override
	   public void draw() {
	      System.out.println("Inside Circle::draw() method.");
	   }

	@Override
	public void fill() {
		  System.out.println("Inside Shape Circle and Color "
		  		+ "--> Red::fill() method.");
		
	}
	}
