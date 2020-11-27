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
		System.out.println("目前的巧克力状态:"+context.getStateName()+"(生产完状态)");
		context.setState(Parameter.decoratedState);
		System.out.println("跳转到下一个巧克力状态:"+context.getStateName()+"(包装完状态)");
	}
}
