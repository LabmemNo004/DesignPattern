package SimpleFactory;

public class PoorEvaluation extends Evaluation{
	
	/**
     * Set the name of the poor evaluation.
     */
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.customer_name=name;
	}
	
	/**
     * Get the result of the poor evaluation of a customer.
     */
	public void getResult() {
		// TODO Auto-generated method stub
		System.out.println("工厂收到客户"+this.customer_name+"的差评");
	}

}
