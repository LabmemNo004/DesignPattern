package State;

import FactoryParameter.Parameter;
/**
 * The Context Class: Context.
 */

public class Context {
	
	private State state;
	
	/**
     * New an initial state(i.e. PowderState).
     *
     * @param state the state
     */
	public Context(){
		System.out.println("======== 使用  State 模式 ========");
		state = new PowderState(this);
	}
	
	/**
     * Set state.
     *
     * @param state the state
     */
	/*
	public void setState(State state) {
		this.state = state;
	}
	*/
	public void setState(int stateId, Context context) {
		switch(stateId){
	    case 11 :
	        this.state = new PowderState(context);
	        break; 
	    case 12 :
	    	this.state = new LiquidState(context);
	    	break; 
	    case 2 :
	    	this.state = new ProducedState(context);
		    break; 
	    case 3 :
	    	this.state = new DecoratedState(context);
		    break; 
	    case 4 :
	    	this.state = new SoldState(context);
		    break; 
	    default : 
	    	System.out.println("Error, unknown stateValue! Check your input in setState()");
	}
	}
	
	/**
     * Get current state value.
     */
	public int getState() {
		return state.stateValue;
	}
	
	/**
     * Get current state name.
     */
	public String getStateName() {
		return state.stateName;
	}
	
	/**
     * Jump to the next state.
     */
	public void jumpState() {
		state.jumpState(this);
	}
}
