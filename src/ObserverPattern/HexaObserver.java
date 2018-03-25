package ObserverPattern;

/**
 * @author Renjith
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
 *  Its subclasses can override the method implementation as per need but the invocation is to be 
 *  in the same way as defined by an abstract class. 
 * This pattern comes under behavior pattern category.
 *
 */
import java.util.ArrayList;
import java.util.List;

public class HexaObserver extends Observer{

	   public HexaObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	   }
	}