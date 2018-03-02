package effectiveJava;
public final class exception2 {
	
	public String name;
	private final String id;
	private final String reason;
	private final String type;	
	
	public exception2(String name, String id, String reason, String type) {		
		this.name = name;
		this.id = id;
		this.reason = reason;
		this.type = type;
	}
	
	public exception2(String id, String reason, String type) {		
		this ("hai", id, reason, type);
		this.name= "pooi";
}
	
	
	public static final exception2 ofSpecificException() {	
		exception2 timeout = new exception2( "specific", "100", "pspecific reason1", "xml");
		return timeout;			
	}
	
	public static void main(String[] args) {		
		exception2 ex1 = new exception2("1", "reason1", "xml");
		
		exception2 ex2 = new exception2("ABCD", "2", "reason2", "xml");
		//ex2.name = "XYZ";
		
		exception2 ex3 = exception2.ofSpecificException();
		
//		System.out.println(ex1);
		System.out.println(ex2);
		System.out.println(ex3);	
		System.out.println(ex3.hashCode());
		
		exception2 ex4 = exception2.ofSpecificException();
		System.out.println(ex4);
		System.out.println(ex4.hashCode());
	}

	@Override
	public String toString() {
		return "exception [name=" + name + ", id=" + id + ", reason=" + reason + ", type=" + type + "]";
	}	
}
