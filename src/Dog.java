/*class Dog { }  
  */
public class Dog extends Animal {  
  static void method(Dog a) {  
    if(a instanceof Dog){  
       Dog d=(Dog)a;//downcasting  
       System.out.println("ok downcasting performed");  
    }  
  }  
   
  public static void main (String [] args) {  
    Dog a=new Dog();  
    Dog.method(a);  
  }  
    
 }  