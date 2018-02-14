package factory;

public class Sony implements Mobile{
	private int ramSize;
	private String processor;
	
	public Sony(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
		System.out.println("i am SONY constructor running");
	}
}
