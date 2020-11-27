package SimpleFactory;

public class PositiveEvaluation extends Evaluation{
	
	/**
     * Set the name of the positive evaluation.
     */
	public void setName(String name) {
		this.customer_name=name;
	}
	
	/**
     * Get the result of the positive evaluation of a customer.
     */
	public void getResult() {
		System.out.println("工厂收到客户"+this.customer_name+"的好评");
	}
}
