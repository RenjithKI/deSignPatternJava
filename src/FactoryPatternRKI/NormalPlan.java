package FactoryPatternRKI;

public class  NormalPlan implements Ticket{  
	protected double  rate;

	@Override
	public void getRate() {
		// TODO Auto-generated method stub
		rate=2.50;		
	}
	
	
	public void calculateBill(int units){  
        System.out.println(units*rate);  
    } 
}