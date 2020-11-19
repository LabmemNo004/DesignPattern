package State;

/**
 * The Chocolate State: ProducedState(stateValue=2).
 */

public class ProducedState extends State{

	/**
     * Set the current stateName and stateValue.
     *
     * @param context the context
     */
	public ProducedState(Context context) {
		stateName="ProducedState";
		stateValue=2;
	}
	
	/**
     * Jump from Produced to Decorated state and print them.
     *
     * @param context the context
     */
	public void jumpState(Context context) {
		System.out.println("Current chocolate state:"+context.getState().stateName);
		context.setState(new DecoratedState(context));
		System.out.println("Jump to next state:"+context.getState().stateName);
	}
}
