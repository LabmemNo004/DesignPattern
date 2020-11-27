import java.util.List;

import org.junit.Test;

import Area.ProcessChocolateArea.ChocolateProductionArea;
import Area.ProcessChocolateArea.ProcessFacade;
import Chocolate.IChocolate;
import Factory.Factory;
import Worker.Attribute;
import Worker.LiquidToSolidWorker;
import Worker.PowderToLiquidWorker;
import Worker.Extension;

public class ProductionAreaTest {
    @Test
    public void test(String[] args){
        Factory factory = Factory.getInstance();//获取工厂对象
        ChocolateProductionArea productionArea = factory.getProductionArea();
        //在生产区创建四个工人
        Attribute p2laAttribute1 = new Attribute("p2l1", "2020-11-1", "男", 100.0);
        PowderToLiquidWorker p2lWorker1 = new PowderToLiquidWorker(p2laAttribute1, "PowderToLiquid");
        productionArea.addFreeWorker(p2lWorker1);//加入普通粉转液工人
        Attribute p2laAttribute2 = new Attribute("p2l2", "2020-11-2", "男", 200.0);
        PowderToLiquidWorker p2lWorker2 = new PowderToLiquidWorker(p2laAttribute2, "PowderToLiquid");
        Extension Superp2lWorker2 = p2lWorker2.GetExtensionWorker();//强化工人
        productionArea.addFreeWorker(Superp2lWorker2);//加入加强粉转液工人
        Attribute l2saAttribute1 = new Attribute("l2s1", "2020-11-1", "女", 300.0);
        LiquidToSolidWorker l2sWorker1 = new LiquidToSolidWorker(l2saAttribute1, "LiquidToSolid");
        productionArea.addFreeWorker(l2sWorker1);//加入普通液转固工人
        Attribute l2saAttribute2 = new Attribute("l2s2", "2020-11-2", "女", 400.0);
        LiquidToSolidWorker l2sWorker2 = new LiquidToSolidWorker(l2saAttribute2, "LiquidToSolid");
        Extension Superl2sWorker2 = l2sWorker2.GetExtensionWorker();//强化工人
        productionArea.addFreeWorker(Superl2sWorker2);//加入加强液转固工人
        //输出工人列表信息
        System.out.println(productionArea.getFreeWorkers().size());
        System.out.println(productionArea.getBusyWorkers().size());
        //分配到各个区域
        productionArea.addAreaWorker(p2lWorker1);
        productionArea.addAreaWorker(Superp2lWorker2);
        productionArea.addAreaWorker(l2sWorker1);
        productionArea.addAreaWorker(Superl2sWorker2);
        System.out.println(productionArea.getFreeWorkers().size());
        System.out.println(productionArea.getBusyWorkers().size());
        System.out.println(productionArea.getMeltArea().getWorkers().size());
        System.out.println(productionArea.getFreezeArea().getWorkers().size());
        ProcessFacade facade = new ProcessFacade();
        facade.produceChocolate();//生产函数
        productionArea.removeAreaWorker(p2lWorker1);
        productionArea.removeAreaWorker(Superp2lWorker2);
        productionArea.removeAreaWorker(l2sWorker1);
        productionArea.removeAreaWorker(Superl2sWorker2);
        System.out.println(productionArea.getFreeWorkers().size());
        System.out.println(productionArea.getBusyWorkers().size());
        System.out.println(productionArea.getMeltArea().getWorkers().size());
        System.out.println(productionArea.getFreezeArea().getWorkers().size());
        List<IChocolate> chocolates = factory.getChocolates();
        System.out.println(chocolates.size());
    }
}
