package Facade.copy;

/**https://www.javatpoint.com/facade-pattern
 * @author Renjith
Facade Pattern
A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces
 in a subsystem, therefore it hides the complexities of the subsystem from the client".
 */
public class Samsung implements MobileShop {  
    @Override  
    public void modelNo() {  
    System.out.println(" Samsung galaxy tab 3 ");  
    }  
    @Override  
    public void price() {  
        System.out.println(" Rs 45000.00 ");  
    }  
}  