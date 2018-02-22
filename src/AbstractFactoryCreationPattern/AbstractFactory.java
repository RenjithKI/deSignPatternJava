package AbstractFactoryCreationPattern;

public abstract class AbstractFactory {
	
	public abstract  Shape getShape(String shapeType);
	public abstract  Color getColorfilled(String color);

}
