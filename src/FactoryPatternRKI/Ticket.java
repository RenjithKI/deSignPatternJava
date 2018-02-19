package FactoryPatternRKI;

public interface Ticket{  
   // final double rate;  
    public void getRate();

	public void calculateBill(int units);  

//    default public void calculateBill(int units){  
//         System.out.println(units*rate);  
//     }  
}//end of Plan class.  