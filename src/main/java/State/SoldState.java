package State;

/**
 * The Chocolate State: SoldState(stateValue=4).
 */

public class SoldState extends State{

	/**
     * Set the current stateName and stateValue.
     *
     * @param context the context
     */
	public SoldState(Context context) {
		stateName="SoldState";
		stateValue=4;
	}
	
	/**
     * No jump! Already the last state.
     *
     * @param context the context
     */
	public void jumpState(Context context) {
		System.out.println("Current chocolate state:"+context.getState().stateName);
		System.out.println("Already in the last state:"+context.getState().stateName);
	}

}
