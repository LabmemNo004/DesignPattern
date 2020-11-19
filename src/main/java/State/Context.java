package State;

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
	public void setState(State state) {
		this.state = state;
	}
	
	/**
     * Get current state.
     */
	public State getState() {
		return state;
	}
	
	/**
     * Get current state value.
     */
	public int getStateValue() {
		return state.stateValue;
	}
	
	/**
     * Jump to the next state.
     */
	public void jumpState() {
		state.jumpState(this);
	}
}
