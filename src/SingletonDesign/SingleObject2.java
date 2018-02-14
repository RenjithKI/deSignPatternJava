package SingletonDesign;

public class SingleObject2 {

   //create an object of SingleObject
   private static SingleObject2 instance = new SingleObject2();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject2(){}

   //Get the only object available
   public static SingleObject2 getInstance(){
      return instance;
   }
   
 //Get the only object available
   public static SingleObject2 getInstance2(){
	   SingleObject2 instance2 = new SingleObject2();
	   return instance2;
   }


   public void showMessage(){
      System.out.println("Hello World!");
   }
   
   
   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject2 object = SingleObject2.getInstance();
	      SingleObject2 object1 = SingleObject2.getInstance2();

	      //show the message
	      object.showMessage();
	      object1.showMessage();
	   }
   
}