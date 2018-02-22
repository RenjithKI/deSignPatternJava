package creational.Prototype.pattern;

import static creational.Prototype.pattern.ShapeCache.*;

public class PrototypePatternDemo2 {
   public static void main(String[] args) {
      loadCache();

      Shape clonedShape = (Shape) getShape("1");
      System.out.println("Shape : " + clonedShape.getType());		

      Shape clonedShape2 = (Shape) getShape("2");
      System.out.println("Shape : " + clonedShape2.getType());		

      Shape clonedShape3 = (Shape) getShape("3");
      System.out.println("Shape : " + clonedShape3.getType());		
   }
}