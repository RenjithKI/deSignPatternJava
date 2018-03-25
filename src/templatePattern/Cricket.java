package templatePattern;

/**
 * @author Renjith
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
 *  Its subclasses can override the method implementation as per need but the invocation is to be 
 *  in the same way as defined by an abstract class. 
 * This pattern comes under behavior pattern category.
 *
 */
public class Cricket extends Game {

	   @Override
	   void endPlay() {
	      System.out.println("Cricket Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Cricket Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Cricket Game Started. Enjoy the game!");
	   }
	}