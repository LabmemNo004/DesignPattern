package State;

import FactoryParameter.Parameter;

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
		stateValue=Parameter.liquidState;
	}
	
	/**
     * Jump from Liquid to Produced state and print them.
     *
     * @param context the context
     */
	public void jumpState(Context context) {
		System.out.println("目前的巧克力状态:"+context.getStateName());
		context.setState(Parameter.producedState);
		System.out.println("跳转到下一个巧克力状态:"+context.getStateName());
	}
}
