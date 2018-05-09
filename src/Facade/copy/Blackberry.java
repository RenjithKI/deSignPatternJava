package Facade.copy;
/**https://www.javatpoint.com/facade-pattern
 * @author Renjith
Facade Pattern
A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces
 in a subsystem, therefore it hides the complexities of the subsystem from the client".
 */
public class Blackberry implements MobileShop {  
    @Override  
    public void modelNo() {  
    System.out.println(" Blackberry Z10 ");  
    }  
    @Override  
    public void price() {  
        System.out.println(" Rs 55000.00 ");  
    }  
}  