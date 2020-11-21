package State;

import FactoryParameter.Parameter;

/**
 * The Chocolate State: DecoratedState(stateValue=3).
 */

public class DecoratedState extends State{
	
	/**
     * Set the current stateName and stateValue.
     *
     * @param context the context
     */
	public DecoratedState(Context context) {
		stateName="DecoratedState";
		stateValue=Parameter.decoratedState;
	}
	
	/**
     * Jump from Decorated to Sold state and print them.
     *
     * @param context the context
     */
	public void jumpState(Context context) {
		System.out.println("Current chocolate state:"+context.getStateName());
		context.setState(Parameter.soldState,context);
		System.out.println("Jump to next state:"+context.getStateName());
	}
}
