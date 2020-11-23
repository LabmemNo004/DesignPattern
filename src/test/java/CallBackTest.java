import CallBack.ReduceMoneyCallBack;
import Charlie.Charlie;
import Factory.Factory;
import Area.RawMaterialManagementArea;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
public class CallBackTest {
    @Test
    public void test() {
        System.out.println("======测试 CallBack 回调模式======");
        int buyBlackNum=1;
        int buyWhiteNum=1;
        Charlie charlie=Charlie.charlie;
        double originAccout=charlie.getAccount();
        double nowAccout;
        double reduceAccout=buyBlackNum* FactoryParameter.Parameter.blackMeterialPrice+buyWhiteNum*FactoryParameter.Parameter.whiteMeterialPrice;
        ReduceMoneyCallBack reduceMoneyCallBack=new ReduceMoneyCallBack(reduceAccout);
        RawMaterialManagementArea area = Factory.getInstance().getManageArea();
        if(reduceMoneyCallBack.call()==true) {
            System.out.println("购买" + buyBlackNum + "份黑巧克力原料" + "和" + buyWhiteNum + "份白巧克力原料");
            area.buyBlackMaterial(buyBlackNum);
            area.buyWhiteMaterial(buyWhiteNum);
            nowAccout = originAccout - reduceAccout;
            Assert.assertEquals(charlie.getAccount(), nowAccout, 0.000001);
        }
    }
}
