package AbstractFactoryCreationPattern;

public  class ColorFactory extends AbstractFactory {
	

	@Override
	public Color getColorfilled(String color) {
		 if(color == null){
	         return null;
	      }		
	      if(color.equalsIgnoreCase("red")){
	         return new Red();
	         
	      } else if(color.equalsIgnoreCase("blue")){
	         return new Blue();
	         
	      } else if(color.equalsIgnoreCase("green")){
	         return new Green();
	      }
	      
	      
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	}