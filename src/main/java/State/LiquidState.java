package State;

/**
 * The Chocolate State: LiquidState(stateValue=12).
 */

public class LiquidState extends State{
	
	/**
     * Set the current stateName and stateValue.
     *
     * @param context the context
     */
	public LiquidState(Context context) {
		stateName="LiquidState";
		stateValue=12;
	}
	
	/**
     * Jump from Liquid to Produced state and print them.
     *
     * @param context the context
     */
	public void jumpState(Context context) {
		System.out.println("Current chocolate state:"+context.getState().stateName);
		context.setState(new ProducedState(context));
		System.out.println("Jump to next state:"+context.getState().stateName);
	}
}
