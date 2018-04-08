package SingletonDesign;

public class ExceptionSingleObj {
	
	final String type;
	final String id;
	final String reason;
	final  String descriprion;
   //create an object of SingleObject constructor
	
	 //field of class
	   public static ExceptionSingleObj instance= null;
		  
	
	 private ExceptionSingleObj(String type, String id, String reason, String descriprion) {
			super();
			this.type = type;
			this.id = id;
			this.reason = reason;
			this.descriprion = descriprion;
		}
	 
	//Get the only object available
	   public static ExceptionSingleObj getInstance(){
	      return innerinit.instancex;
	   }
	
	
	

  /* public void showMessage(){
      System.out.println("Hello World!");
   }
   
   
   */
   @Override
public String toString() {
	return "ExceptionSingleObj [type=" + type + ", id=" + id + ", reason=" + reason + ", descriprion=" + descriprion
			+ "]";
}

public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      ExceptionSingleObj object = ExceptionSingleObj.getInstance();
	      ExceptionSingleObj object1 = ExceptionSingleObj.instance;

	      //show the message
	      object.toString();
	      //object1.toString();
	      
	      System.out.println(object.toString());
	      System.out.println(object1.toString());
	   }


 static class innerinit {
	static ExceptionSingleObj instancex = new ExceptionSingleObj("ststictyoe", "id", "reason", "descriprion");
   // System.out.println("Hello World!");
	
	static ExceptionSingleObj instance2 = new ExceptionSingleObj("ststictyoe", "id", "reason", "descriprion");
   
	}
   
}