package effectiveJava;
public final class exception {
	
	public final String name;
	private final String id;
	private final String reason;
	private final String type;	
	
	/*public exception(String id, String reason, String type) {		
		this.id = id;
		this.reason = reason;
		this.type = type;
	}*/
	
	public exception(String name, String id, String reason, String type) {		
		this.name = name;
		this.id = id;
		this.reason = reason;
		this.type = type;
	}	
	
	
	public static final exception ofSpecificException() {	
		exception timeout = new exception( "specific", "100", "pspecific reason1", "xml");
		return timeout;			
	}
	
	public static void main(String[] args) {		
		/*exception ex1 = new exception("1", "reason1", "xml");*/
		
		exception ex2 = new exception("ABCD", "2", "reason2", "xml");
		//ex2.name = "XYZ";
		
		exception ex3 = exception.ofSpecificException();
		
//		System.out.println(ex1);
		System.out.println(ex2);
		System.out.println(ex3);	
		System.out.println(ex3.hashCode());
		
		exception ex4 = exception.ofSpecificException();
		System.out.println(ex4);
		System.out.println(ex4.hashCode());
	}

	@Override
	public String toString() {
		return "exception [name=" + name + ", id=" + id + ", reason=" + reason + ", type=" + type + "]";
	}	
}
