package effectiveJava;
public final class exceptionStaticFactory {	
	public String name;
	private final String id;
	private final String reason;
	private final String type;	
	
	public exceptionStaticFactory(String name, String id, String reason, String type) {		
		this (id, reason, type);
		this.name = name;
	}
	
	public exceptionStaticFactory(String id, String reason, String type) {		
		this.name= "pooi";
		this.id = id;
		this.reason = reason;
		this.type = type;
}
	
	
	public static final exceptionStaticFactory ofSpecificException() {	
		exceptionStaticFactory timeout = new exceptionStaticFactory( "specific", "100", "pspecific reason1", "xml");
		return timeout;			
	}
	//RKI
	
	private static exceptionStaticFactory sinlgeInstance = new exceptionStaticFactory( "sigleton", "700", "pspecific reason2", "xml");;	
	public static final exceptionStaticFactory ofSpecificExceptionSigleton() {	
		return sinlgeInstance;		
	}
	
	public static void main(String[] args) {		
		
		exceptionStaticFactory ex30 = new exceptionStaticFactory( "000", "100", "pspecific reason1", "xml");
		System.out.println(ex30);	
		System.out.println(ex30.hashCode());
		
		exceptionStaticFactory ex40 = exceptionStaticFactory.ofSpecificException();
		System.out.println(ex40);
		System.out.println(ex40.hashCode());
		
		//
		System.out.println("________________________________________________-");
		//
		exceptionStaticFactory ex01 = exceptionStaticFactory.ofSpecificExceptionSigleton();
		System.out.println(ex01);	
		System.out.println(ex01.hashCode());
		
		exceptionStaticFactory ex02 = exceptionStaticFactory.ofSpecificExceptionSigleton();
		System.out.println(ex02);
		System.out.println(ex02.hashCode());
	}

	@Override
	public String toString() {
		return "exception [name=" + name + ", id=" + id + ", reason=" + reason + ", type=" + type + "]";
	}	
}
