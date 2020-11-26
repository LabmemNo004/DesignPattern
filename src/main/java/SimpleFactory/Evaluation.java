package SimpleFactory;

public abstract class Evaluation {
	
	String customer_name;
	
	/**
     * Abstract method: get the result of an evaluation from a customer
     */
	public abstract void getResult();
	
	/**
     * Abstract method: set the name of the evaluation
     */
	public abstract void setName(String name);
}
