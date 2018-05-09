package BuilderPatternTelescopic;
//telescopic constructor demo
public class NutritionalFactsTelescopicTestDemo {
	   public static void main(String[] args) {
	   
		  NutritionalFactsTelescopic cocoCola = new NutritionalFactsTelescopic(240, 8,100,0, 35, 27);
	      System.out.println("NutritionalFactsTelescopic of coca cola is : " 
	    		  + cocoCola.toString());
	      
	      //
	      
	      NutritionalFactsTelescopic pepsi = new NutritionalFactsTelescopic(240, 8,100,0, 35, 27);
	      pepsi.Calories = 900;	      
	      System.out.println("NutritionalFactsTelescopic ofpepsi is : " 
	    		  + pepsi.toString());
	      
	   }  
	   
	}
