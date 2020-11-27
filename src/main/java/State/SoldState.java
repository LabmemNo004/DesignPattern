package State;

import FactoryParameter.Parameter;

/**
 * The Chocolate State: SoldState(stateValue=4).
 */

public class SoldState extends State{

	/**
     * Set the current stateName and stateValue.
     *
     * @param context the context
     */
	public SoldState(Context context) {
		stateName="SoldState";
		stateValue=Parameter.soldState;
	}
	
	/**
     * No jump! Already the last state.
     *
     * @param context the context
     */
	public void jumpState(Context context) {
		System.out.println("目前的巧克力状态:"+context.getStateName());
		System.out.println("巧克力已经在最后一个状态:"+context.getStateName());
	}

}
