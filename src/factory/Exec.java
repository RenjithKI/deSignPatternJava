package factory;

public class Exec {
	 public static void main(String[] args) {
		 MobileFactory MobileFactory = new MobileFactory();
		Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
		Mobile mobile2 = MobileFactory.createMobile(Mobile.IPHONE);
		Mobile mobile3 = MobileFactory.createMobile(Mobile.SONY);
	}
}
