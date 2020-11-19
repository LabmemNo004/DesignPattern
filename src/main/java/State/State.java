package State;

/**
 * The Abstract Class: State.
 */

public abstract class State {
	
	protected String stateName;
	protected int stateValue;
	
	/**
     * Abstract method: Jump to the next state
     *
     * @param context the context
     */
	public abstract void jumpState(Context context);
	
}
