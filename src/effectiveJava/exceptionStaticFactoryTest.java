package effectiveJava;
public final class exceptionStaticFactoryTest {	
		
	public static void main(String[] args) {		
		
		exceptionStaticFactory ex30 = exceptionStaticFactory.ofSpecificException();
		System.out.println(ex30);	
		System.out.println(ex30.hashCode());
		
		exceptionStaticFactory ex40 = exceptionStaticFactory.ofSpecificException();
		System.out.println(ex40);
		System.out.println(ex40.hashCode());
		
		//
		System.out.println("________________________366712642________________________-");
		//
		exceptionStaticFactory ex01 = exceptionStaticFactory.ofSpecificExceptionSigleton();
		System.out.println(ex01);	
		System.out.println(ex01.hashCode());
		
		exceptionStaticFactory ex02 = exceptionStaticFactory.ofSpecificExceptionSigleton();
		System.out.println(ex02);
		System.out.println(ex02.hashCode());
	}

	
}
