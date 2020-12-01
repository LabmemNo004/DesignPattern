package command;

import entity.Material;
import entity.Player;
import org.junit.Test;

/**
 * 
 * @Tester transparency
 * @Date 19:35 2020/12/1
 * 该类用于测试Command设计模式
 */
public class CommandTest {
	@Test
	public void commandTest() {
		System.out.println("================ TEST Command ================");
        Player player = new Player();
		AwardMedalCommand cmd = new AwardMedalCommand(player,"Swimming", Material.Gold);
		cmd.execute();
		System.out.println("========================TEST END ========================");
	}
}
