import java.util.List;

import org.junit.Test;

import Area.ProcessChocolateArea.ChocolateProductionArea;
import Area.ProcessChocolateArea.ProcessFacade;
import Chocolate.Chocolate;
import Chocolate.IChocolate;
import Factory.Factory;
import Worker.Attribute;
import Worker.LiquidToSolidWorker;
import Worker.PowderToLiquidWorker;

public class ProductionAreaTest {
    // @Test
    // public void test(String[] args){
    //     Factory factory = Factory.getInstance();//获取工厂对象
    //     ChocolateProductionArea area = factory.getProductionArea();
    //     //在生产区创建四个工人
    //     Attribute p2laAttribute1 = new Attribute("p2l1", "2020-11-1", "男", 100.0);
    //     PowderToLiquidWorker p2lWorker1 = new PowderToLiquidWorker(p2laAttribute1, "PowderToLiquid");
    //     area.addFreeWorker(p2lWorker1);
    //     Attribute p2laAttribute2 = new Attribute("p2l2", "2020-11-2", "男", 200.0);
    //     PowderToLiquidWorker p2lWorker2 = new PowderToLiquidWorker(p2laAttribute2, "SuperPowderToLiquid");
    //     area.addFreeWorker(p2lWorker2);
    //     Attribute l2saAttribute1 = new Attribute("l2s1", "2020-11-1", "女", 300.0);
    //     LiquidToSolidWorker l2sWorker1 = new LiquidToSolidWorker(l2saAttribute1, "LiquidToSolid");
    //     area.addFreeWorker(l2sWorker1);
    //     Attribute l2saAttribute2 = new Attribute("l2s2", "2020-11-2", "女", 400.0);
    //     LiquidToSolidWorker l2sWorker2 = new LiquidToSolidWorker(l2saAttribute2, "SuperLiquidToSolid");
    //     area.addFreeWorker(l2sWorker2);
    //     //输出工人列表信息
    //     System.out.println(area.getFreeWorkers().size());
    //     System.out.println(area.getBusyWorkers().size());
    //     //分配到各个区域
    //     area.addAreaWorker(p2lWorker1);
    //     area.addAreaWorker(p2lWorker2);
    //     area.addAreaWorker(l2sWorker1);
    //     area.addAreaWorker(l2sWorker2);
    //     System.out.println(area.getFreeWorkers().size());
    //     System.out.println(area.getBusyWorkers().size());
    //     System.out.println(area.getMeltArea().getWorkers().size());
    //     System.out.println(area.getFreezeArea().getWorkers().size());
    //     ProcessFacade facade = new ProcessFacade();
    //     facade.produceChocolate();//生产函数
    //     area.removeAreaWorker(p2lWorker1);
    //     area.removeAreaWorker(p2lWorker2);
    //     area.removeAreaWorker(l2sWorker1);
    //     area.removeAreaWorker(l2sWorker2);
    //     System.out.println(area.getFreeWorkers().size());
    //     System.out.println(area.getBusyWorkers().size());
    //     System.out.println(area.getMeltArea().getWorkers().size());
    //     System.out.println(area.getFreezeArea().getWorkers().size());
    //     System.out.println(factory.getChocolates().size());
    // }

    public static void main(String[] args) {
        Factory factory = Factory.getInstance();//获取工厂对象
        ChocolateProductionArea area = factory.getProductionArea();
        //在生产区创建四个工人
        Attribute p2laAttribute1 = new Attribute("p2l1", "2020-11-1", "男", 100.0);
        PowderToLiquidWorker p2lWorker1 = new PowderToLiquidWorker(p2laAttribute1, "PowderToLiquid");
        area.addFreeWorker(p2lWorker1);
        Attribute p2laAttribute2 = new Attribute("p2l2", "2020-11-2", "男", 200.0);
        PowderToLiquidWorker p2lWorker2 = new PowderToLiquidWorker(p2laAttribute2, "SuperPowderToLiquid");
        area.addFreeWorker(p2lWorker2);
        Attribute l2saAttribute1 = new Attribute("l2s1", "2020-11-1", "女", 300.0);
        LiquidToSolidWorker l2sWorker1 = new LiquidToSolidWorker(l2saAttribute1, "LiquidToSolid");
        area.addFreeWorker(l2sWorker1);
        Attribute l2saAttribute2 = new Attribute("l2s2", "2020-11-2", "女", 400.0);
        LiquidToSolidWorker l2sWorker2 = new LiquidToSolidWorker(l2saAttribute2, "SuperLiquidToSolid");
        area.addFreeWorker(l2sWorker2);
        //输出工人列表信息
        System.out.println(area.getFreeWorkers().size());
        System.out.println(area.getBusyWorkers().size());
        //分配到各个区域
        area.addAreaWorker(p2lWorker1);
        area.addAreaWorker(p2lWorker2);
        area.addAreaWorker(l2sWorker1);
        area.addAreaWorker(l2sWorker2);
        System.out.println(area.getFreeWorkers().size());
        System.out.println(area.getBusyWorkers().size());
        System.out.println(area.getMeltArea().getWorkers().size());
        System.out.println(area.getFreezeArea().getWorkers().size());
        ProcessFacade facade = new ProcessFacade();
        facade.produceChocolate();//生产函数
        area.removeAreaWorker(p2lWorker1);
        area.removeAreaWorker(p2lWorker2);
        area.removeAreaWorker(l2sWorker1);
        area.removeAreaWorker(l2sWorker2);
        System.out.println(area.getFreeWorkers().size());
        System.out.println(area.getBusyWorkers().size());
        System.out.println(area.getMeltArea().getWorkers().size());
        System.out.println(area.getFreezeArea().getWorkers().size());
        List<IChocolate> chocolates = factory.getChocolates();
        System.out.println(chocolates.size());
    }
}
