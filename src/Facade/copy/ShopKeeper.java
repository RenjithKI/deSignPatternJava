package Facade.copy;

/**https://www.javatpoint.com/facade-pattern
 * @author Renjith
Facade Pattern
A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces
 in a subsystem, therefore it hides the complexities of the subsystem from the client".
 */
public class ShopKeeper {  
	private MobileShop iphone;  
	private MobileShop samsung;  
	private MobileShop blackberry;  

	public ShopKeeper(){  
		iphone= new Iphone();  
		samsung=new Samsung();  
		blackberry=new Blackberry();  
	}  
	public void iphoneSale(){  
		iphone.modelNo();  
		iphone.price();  
	}  
	public void samsungSale(){  
		samsung.modelNo();  
		samsung.price();  
	}  
	public void blackberrySale(){  
		blackberry.modelNo();  
		blackberry.price();  
	}  
}    