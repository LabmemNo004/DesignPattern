import CallBack.ReduceMoneyCallBack;
import Charlie.Charlie;
import Factory.Factory;
import FactoryParameter.FactoryParameter;
import Area.RawMaterialManagementArea;

import static org.junit.Assert.assertEquals;
public class CallBackTest {
    public void test() {
        System.out.println("======测试 CallBack 回调模式======");
        int buyBlackNum=1;
        int buyWhiteNum=1;
        double originAccout=Charlie.charlie.getAccount();
        double nowAccout;
        double reduceAccout=buyBlackNum* FactoryParameter.blackMeterialPrice+buyWhiteNum*FactoryParameter.whiteMeterialPrice;
        ReduceMoneyCallBack reduceMoneyCallBack=new ReduceMoneyCallBack(reduceAccout,Charlie.charlie);
        RawMaterialManagementArea area = Factory.getInstance().getManageArea();
        if(reduceMoneyCallBack.call()==true)
        {
            System.out.println("购买"+buyBlackNum+"份黑巧克力原料"+"和"+buyWhiteNum+"份白巧克力原料");
            area.buyBlackMaterial(buyBlackNum);
            area.buyWhiteMaterial(buyWhiteNum);
            nowAccout=originAccout-reduceAccout;
            Assert.assertEquals(Charlie.charlie.getAccount(),nowAccout,0.000001);
        }

    }
}
