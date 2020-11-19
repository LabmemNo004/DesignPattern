package State;

/**
 * The Chocolate State: PowderState(stateValue=11).
 */

public class PowderState extends State{
	
	/**
     * Set the current stateName and stateValue.
     *
     * @param context the context
     */
	public PowderState(Context context) {
		stateName="PowderState";
		stateValue=11;
	}
	
	/**
     * Jump from Powder to Liquid state and print them.
     *
     * @param context the context
     */
	public void jumpState(Context context) {
		System.out.println("Current chocolate state:"+context.getState().stateName);
		context.setState(new LiquidState(context));
		System.out.println("Jump to next state:"+context.getState().stateName);
	}
}
