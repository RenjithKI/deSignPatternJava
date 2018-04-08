package statePattern;
import static staticImportPattern.TicketFare2.*;


/**
 * @author Renjith
 *
 */
public interface State {
	   public void doAction(Context context);
	}