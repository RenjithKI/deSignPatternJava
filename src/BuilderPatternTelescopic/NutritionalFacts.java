package BuilderPatternTelescopic;

public class NutritionalFacts {

	private final int ServingSize;  // (ml)   required
	private final int Serving;  // (per container)   required
	
	public  int Calories;  // (per serving)	optional
	private final int Fat;  // (g/serving)   optional
	private final int Sodium;  // (mg/serving)  optional
	private final int Carbohydrates;  // (g/serving)    optional
	
	
	public NutritionalFacts(int servingSize, int serving) {
	this (servingSize, serving, 0);
	}
	
	public NutritionalFacts(int servingSize, int serving, int calories) {
		this (servingSize, serving, calories, 0);
		}
	
	public NutritionalFacts(int servingSize, int serving, int calories, int fat) {
		this (servingSize, serving, calories, fat, 0);
		}
	
	public NutritionalFacts(int servingSize, int serving, int calories, int fat, int sodium) {
		this (servingSize, serving, calories, fat, sodium, 0);
	}

	public NutritionalFacts(int servingSize, int serving, int calories, int fat, int sodium, int carbohydrates) {		
		this.ServingSize = servingSize;
		this.Serving = serving;
		this.Calories = calories;
		this.Fat = fat;
		this.Sodium = sodium;
		this.Carbohydrates = carbohydrates;
	}
	//to string method 
	@Override
	public String toString() {
		return "NutritionalFacts [ServingSize=" + ServingSize + ", Serving=" + Serving + ", Calories=" + Calories
				+ ", Fat=" + Fat + ", Sodium=" + Sodium + ", Carbohydrates=" + Carbohydrates + "]";
	}	
	
	
	

}