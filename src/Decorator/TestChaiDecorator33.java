package Decorator;
public class TestChaiDecorator33 {            
    
	   public static void main(String[] args) {
	       Tea teaLeaves = new TeaLeaves();
	       Tea chaiDecorator = new ChaiDecorator(teaLeaves);
	       chaiDecorator.steepTea();
	   }
	}