package bridge;
import entity.Material;
import entity.Medal;
import org.junit.Test;

/**
 * 
 * @author hzj
 * @time 2020-12-01
 *该类用于测试Bridge设计模式
 */
public class BridgeTest {
	@Test
	public void bridgeTest() {
		System.out.println("---------------- Test [Pattern] Bridge ----------------");
        try {
			Medal myMedal=new Medal(Material.Gold,"Basketball");
			myMedal.printMedalInfo();
			myMedal=new Medal(Material.Silver,"Swimming");
			myMedal.printMedalInfo();
			//异常输入测试
			myMedal=new Medal(Material.Silver,"???");
			myMedal.printMedalInfo();
		}
		catch (RuntimeException e){
        	 System.out.println("不存在");
		}
		System.out.println("------------------------ Over ------------------------");
	}
}
