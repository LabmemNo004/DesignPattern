import Chocolate.Chocolate;
import Color.WhiteColor;
import Mould.BigMould;
import Shaped.StarShaped;
import org.junit.Test;
import Worker.*;
public class TemplateTest {
    @Test
    public void test(){
        System.out.println("======测试 Template 模板模式======");
        Attribute attribute1=new Attribute("007","2000.01.01","male",5000);
        PowderToLiquidWorker worker1=new PowderToLiquidWorker(attribute1,"PowderToLiquid");
        Attribute attribute2=new Attribute("008","2001.01.01","female",5000);
        LiquidToSolidWorker worker2=new LiquidToSolidWorker(attribute2,"LiquidToSolid");
        Chocolate chocolate1=new Chocolate();
        BigMould bigStarWhiteMould=new BigMould(new StarShaped(),new WhiteColor());
        chocolate1.setProduceStrategy(bigStarWhiteMould);
        chocolate1.setSSC(bigStarWhiteMould);
        Chocolate chocolate2=worker1.work(chocolate1);
        worker2.work(chocolate2,bigStarWhiteMould);
    }
}
