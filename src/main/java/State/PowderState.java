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
		System.out.println("目前的巧克力状态:"+context.getStateName()+"(粉末状态)");
		context.setState(Parameter.liquidState);
		System.out.println("跳转到下一个巧克力状态:"+context.getStateName()+"(液体状态)");
	}
}
