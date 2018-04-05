package zzInterviewQandA;

public abstract  class Parent {
	 protected String name;
	 private int age;	 
	 private String type;
	 
	 public Parent() {}
	
	public Parent(String name, int age) {	
		this.name = name;
		this.age = age;		
	}
	
	public abstract String getNameLenth();	
}