package effectiveJava;
public final class exception3 {
	
	public String name;
	private final String id;
	private final String reason;
	private final String type;	
	
	public exception3(String name, String id, String reason, String type) {		
		this (id, reason, type);
		this.name = name;
	}
	
	public exception3(String id, String reason, String type) {		
		this.name= "pooi";
		this.id = id;
		this.reason = reason;
		this.type = type;
}
	
	
	public static final exception3 ofSpecificException() {	
		exception3 timeout = new exception3( "specific", "100", "pspecific reason1", "xml");
		return timeout;			
	}
	
	public static void main(String[] args) {		
		exception3 ex1 = new exception3("1", "reason1", "xml");
		
		exception3 ex2 = new exception3("ABCD", "2", "reason2", "xml");
		//ex2.name = "XYZ";
		
		exception3 ex3 = exception3.ofSpecificException();
		
//		System.out.println(ex1);
		System.out.println(ex2);
		System.out.println(ex3);	
		System.out.println(ex3.hashCode());
		
		exception3 ex4 = exception3.ofSpecificException();
		System.out.println(ex4);
		System.out.println(ex4.hashCode());
	}

	@Override
	public String toString() {
		return "exception [name=" + name + ", id=" + id + ", reason=" + reason + ", type=" + type + "]";
	}	
}
