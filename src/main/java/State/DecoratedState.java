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
		System.out.println("目前的巧克力状态:"+context.getStateName());
		context.setState(Parameter.waitSoldState);
		System.out.println("跳转到下一个巧克力状态:"+context.getStateName());
	}
}
