package State;

import FactoryParameter.Parameter;

/**
 * The Chocolate State: SoldState(stateValue=35).
 */

public class waitSoldState extends State{

    /**
     * Set the current stateName and stateValue.
     *
     * @param context the context
     */
    public waitSoldState(Context context) {
        stateName="waitSoldState";
        stateValue=Parameter.waitSoldState;
    }

    /**
     * No jump! Already the last state.
     *
     * @param context the context
     */
    public void jumpState(Context context) {
    	/*
        System.out.println("Current chocolate state:"+context.getStateName());
        System.out.println("Already in the last state:"+context.getStateName());
        */
    	System.out.println("目前的巧克力状态:"+context.getStateName());
    	context.setState(Parameter.soldState);
        System.out.println("跳转到下一个巧克力状态:"+context.getStateName());
    }

}
