package SimpleFactory;

public class EvaluationFactory {
	
	public EvaluationFactory() {
		System.out.println("======== 使用  Simple Factory 模式 ========");
	}
	
	/**
     * Create evaluation
     */
	public static Evaluation createEvaluation(String type, String customer_name)throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		switch(type) {
			case "good":
				PositiveEvaluation eval_1 = new PositiveEvaluation();
				eval_1.setName(customer_name);
				System.out.println("客户"+customer_name+"给予巧克力好评");
				return eval_1;
			case "bad":
				PoorEvaluation eval_2 = new PoorEvaluation();
				eval_2.setName(customer_name);
				System.out.println("客户"+customer_name+"给予巧克力差评");
				return eval_2;
			default:
				System.out.println("客户"+customer_name+"未作出评价");
				return null;
		}
	}
}
