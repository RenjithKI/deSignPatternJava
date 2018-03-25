package templatePattern;

/**
 * @author Renjith
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
 *  Its subclasses can override the method implementation as per need but the invocation is to be 
 *  in the same way as defined by an abstract class. 
 * This pattern comes under behavior pattern category.
 *
 */
public class Football extends Game {

	   @Override
	   void endPlay() {
	      System.out.println("Football Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Football Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Football Game Started. Enjoy the game!");
	   }
	}