package State;

import java.io.Serializable;

/**
 * The Abstract Class: State.
 */

public abstract class State implements Serializable {
	
	public String stateName;
	public int stateValue;
	
	/**
     * Abstract method: Jump to the next state
     *
     * @param context the context
     */
	public abstract void jumpState(Context context);
	
}
