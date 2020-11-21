package State;

import FactoryParameter.Parameter;

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
		stateValue=Parameter.powderState;
	}
	
	/**
     * Jump from Powder to Liquid state and print them.
     *
     * @param context the context
     */
	public void jumpState(Context context) {
		System.out.println("Current chocolate state:"+context.getStateName());
		context.setState(Parameter.liquidState,context);
		System.out.println("Jump to next state:"+context.getStateName());
	}
}
