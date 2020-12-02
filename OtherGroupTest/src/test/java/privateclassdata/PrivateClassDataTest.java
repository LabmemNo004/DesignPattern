package privateclassdata;
import entity.Player;
import org.junit.Test;
import privateclassdata.entity.PlayerData;

/**
 * 
 * @author Zhang
 *该类用于测试PrivateClassData设计模式
 *@Date: Modified in 20:35 2020/12/01
 *@Modified By:IsabelleCur

 */
public class PrivateClassDataTest {
	@Test
	public void privateClassDataTest() {
		System.out.println("---------------- [Pattern] PrivateClassData ----------------");
		Player myPlayer=new Player();

		//初始化运动员信息
		System.out.println("初始化运动员信息");
		myPlayer.initPlayerData();

		PlayerData myData=myPlayer.playerData;
		System.out.println("运动员ID："+myData.getPlayerId());
		System.out.println("运动员姓名："+myData.getPlayerName());
		System.out.println("运动员动物类型："+myData.getPlayerType());
		
		//设置运动员信息
		myData.setPlayerId("CNN1");
		myData.setPlayerName("KiKi");
		myData.setPlayerType("Monkey");
		
		//检查输出
		System.out.println("运动员ID："+myPlayer.playerData.getPlayerId());
		System.out.println("运动员姓名："+myPlayer.playerData.getPlayerName());
		System.out.println("运动员动物类型："+myPlayer.playerData.getPlayerType());
		System.out.println("------------------------ END ------------------------");


	}
}

