package morePrivateKeyword;

public class Child2 extends Parent {

	 private String custometType;
	
	public Child2(String cType) {
		super();
		this.custometType = cType;		
	}
	public Child2(String n, int a, String cType) {
		super(n,a);
		this.custometType = cType;
	}

	public String getNameLenth() {	
//		int a= name.length();
//		String s = String.valueOf(name.length());
		return String.valueOf(name.length());		 
	}
	
}