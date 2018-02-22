package BuilderPatternTelescopic;
/**
 * @author Renjith
 *
 */
public class NutritionalFactsBuilderPattern {
	
	private final int ServingSize;  // (ml)   required
	private final int Serving;  // (per container)   required
	
	private final int Calories;  // (per serving)	optional
	private final int Fat;  // (g/serving)   optional
	private final int Sodium;  // (mg/serving)  optional
	private final int Carbohydrates;  // (g/serving)    optional	
	
	public static class Builder {		
		/*required parameter*/
		
		private int ServingSize;  // (ml)   required
		private int Serving;  // (per container)   required		
		/*optional parameter*/
		private int Calories 		= 0;  // (per serving)	optional
		private int Fat 			= 0;  // (g/serving)   optional
		private int Sodium			= 0;  // (mg/serving)  optional
		private int Carbohydrates	= 0;  // (g/serving)    optional	
		
		public Builder(int servingSize, int serving) {
			this.ServingSize = servingSize;
			this.Serving = serving;
		}
		
		public Builder setCalories(int calories) {
			Calories = calories;
			return this;
		}
		public Builder setFat(int fat) {
			Fat = fat;
			return this;
		}
		public Builder setSodium(int sodium) {
			Sodium = sodium;
			return this;
		}
		public Builder setCarbohydrates(int carbohydrates) {
			Carbohydrates = carbohydrates;
			return this;
		}
		//
		public NutritionalFactsBuilderPattern build() {			
			return new NutritionalFactsBuilderPattern(this);
		}
	}
		
		public NutritionalFactsBuilderPattern(Builder builder) {
			ServingSize = builder.ServingSize;
			Serving = builder.Serving;
			Calories = builder.Calories;
			Fat = builder.Fat;
			Sodium = builder.Sodium;
			Carbohydrates = builder.Carbohydrates;
		}
		
	  public static void main(String[] args) {		   
		  NutritionalFactsBuilderPattern cocoCola = new NutritionalFactsBuilderPattern.Builder(240, 8)
			.setCalories(100).setSodium(35).setCarbohydrates(27).build();
		 
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