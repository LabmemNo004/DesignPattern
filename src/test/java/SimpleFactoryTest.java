import org.junit.Test;
import SimpleFactory.*;

public class SimpleFactoryTest {
	@Test
	public void test() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		System.out.println("测试SimpleFactory模式：");
		EvaluationFactory factory = new EvaluationFactory();
		Evaluation first_eval = factory.createEvaluation("good","Jack");
		Evaluation second_eval = factory.createEvaluation("bad","Ellen");
		if(first_eval != null) {
			first_eval.getResult();
		}
		if(second_eval != null) {
			second_eval.getResult();
		}
	}
}
