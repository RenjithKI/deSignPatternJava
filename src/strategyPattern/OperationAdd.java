package strategyPattern;

/**
 * @author Renjith
 * 
 * This pattern comes under behavior pattern category.
 *
 */
public class OperationAdd implements Strategy{
	   @Override
	   public int doOperation(int num1, int num2) {
	      return num1 + num2;
	   }
	}