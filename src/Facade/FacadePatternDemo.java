package Facade;

/**
 * @author Renjith
 *
 */
public class FacadePatternDemo {
   public static void main(String[] args) {
	   /*facade */
      ShapeMaker shapeMaker = new ShapeMaker();
      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();	
      
      /*facade */
     /* ShapeMaker shapeMaker = new ShapeMaker();
      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();	*/	
      
   }
}