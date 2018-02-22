package BuilderPatternTelescopic;
//telescopic constructor demo
public class NutritionalFactsDemo {
	   public static void main(String[] args) {
	   
		  NutritionalFacts cocoCola = new NutritionalFacts(240, 8,100,0, 35, 27);
	      System.out.println("NutritionalFacts of coca cola is : " 
	    		  + cocoCola.toString());
	      
	      //
	      
	      NutritionalFacts pepsi = new NutritionalFacts(240, 8,100,0, 35, 27);
	      pepsi.Calories = 900;	      
	      System.out.println("NutritionalFacts ofpepsi is : " 
	    		  + pepsi.toString());
	      
	   }  
	   
	}
