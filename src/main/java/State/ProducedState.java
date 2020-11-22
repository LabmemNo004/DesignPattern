package State;

import FactoryParameter.Parameter;

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
		stateValue=Parameter.producedState;
	}
	
	/**
     * Jump from Produced to Decorated state and print them.
     *
     * @param context the context
     */
	public void jumpState(Context context) {
		System.out.println("Current chocolate state:"+context.getStateName());
		context.setState(Parameter.decoratedState);
		System.out.println("Jump to next state:"+context.getStateName());
	}
}
