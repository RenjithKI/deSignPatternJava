package FactoryPatternRKI;

public class  StudentPlan implements Ticket{  
   //@override   
	
	protected double  rate;
    
    public void calculateBill(int units){  
        System.out.println(units*rate);  
    }  
//end of CommercialPlan class.  

	@Override
	public void getRate() {
		// TODO Auto-generated method stub
		rate=0.50;
		
	}
}