package BuilderPatternTelescopic;

public class NutritionalFactsBeanPattern {
	

	private int ServingSize = -1;  // (ml)   required
	private int Serving = -1;  // (per container)   required
	
	private int Calories = 0;  // (per serving)	optional
	private int Fat = 0;  // (g/serving)   optional
	private int Sodium = 0;  // (mg/serving)  optional
	private int Carbohydrates = 0;  // (g/serving)    optional
	
	
	public NutritionalFactsBeanPattern() {	}
	
	//setters 
	public void setServingSize(int servingSize) {
		ServingSize = servingSize;
	}
	public void setServing(int serving) {
		Serving = serving;
	}
	public void setCalories(int calories) {
		Calories = calories;
	}
	public void setFat(int fat) {
		Fat = fat;
	}
	public void setSodium(int sodium) {
		Sodium = sodium;
	}
	public void setCarbohydrates(int carbohydrates) {
		Carbohydrates = carbohydrates;
	}
/*test main method
*/	  public static void main(String[] args) {
		   
	NutritionalFactsBeanPattern cocoCola = new NutritionalFactsBeanPattern();
		  cocoCola.setServingSize(240);
		  cocoCola.setServing(8);
		  cocoCola.setCalories(100);
		  cocoCola.setSodium(35);
		  cocoCola.setCarbohydrates(27);
		  
		  
	      System.out.println("NutritionalFactsBean of coca cola is : " 
	    		  + cocoCola.toString());	          
	   } 



	//to string method 
	@Override
	public String toString() {
		return "NutritionalFacts [ServingSize=" + ServingSize + ", Serving=" + Serving + ", Calories=" + Calories
				+ ", Fat=" + Fat + ", Sodium=" + Sodium + ", Carbohydrates=" + Carbohydrates + "]";
	}	
	
	
	

}