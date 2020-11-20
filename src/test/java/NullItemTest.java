import Chocolate.*;
import org.junit.Test;

public class NullItemTest {
	@Test
    public void nullObjectTest() {
        System.out.println("======== 测试 Null Object 模式 ========");
        Pocket pocket = new Pocket("pocket1",10);
        System.out.println("用户想要get pocketList[-1]，使用Null Object模式返回：");
        Items _item=pocket.getItem(-1);
        _item.getName();
	}
}
