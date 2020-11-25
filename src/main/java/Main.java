import Area.ProcessChocolateArea.ChocolateProductionArea;
import Area.ProcessChocolateArea.ProcessFacade;
import BusinessDelegate.BusinessDelegate;
import BusinessDelegate.Client;
import Factory.Factory;
import FactoryParameter.Parameter;
import Mediator.ChocolateMediator;
import Worker.Attribute;
import Worker.LiquidToSolidWorker;
import Worker.PowderToLiquidWorker;

public class Main {
    public static void main(String[] args){

        // 初始化农场，根据调用关系先后用到了以下设计模式：
        // 双重检查锁模式
        // 建造者模式
        // 抽象工厂模式
        // 享元模式
        // 桥接模式
        // 多例模式
        // 私有类数据模式
        // 组合模式



        Factory factory = Factory.getInstance();

        //业务代理模式初始化，无需改动位置，可供查看工厂中_chocolates状态与生产区工人空闲与忙碌状态
        BusinessDelegate businessDelegate = new BusinessDelegate();
        Client client = new Client(businessDelegate);


        {
            //这一段代码可以加在任何区域代码之中
            System.out.println("业务代理模式查看工厂巧克力状态");
            businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_CHOCOLATE);
            client.doTask();

            //这一段代码必须加在生产区域代码之中
            System.out.println("业务代理模式查看工人状态");
            businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_WORKERS);
            client.doTask();

            // 中介者模式
            ChocolateMediator chocolateMediator = new ChocolateMediator();
            chocolateMediator.setFactory(factory);
            factory.setMediatorForFactory(chocolateMediator);
            factory.addMediatorForAll();

            ChocolateProductionArea area=factory.getProductionArea();

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

            //分配到各个区域
            area.addAreaWorker(p2lWorker1);
            area.addAreaWorker(p2lWorker2);
            area.addAreaWorker(l2sWorker1);
            area.addAreaWorker(l2sWorker2);

            ProcessFacade facade = new ProcessFacade();
            facade.produceChocolate();//生产函数
            area.removeAreaWorker(p2lWorker1);
            area.removeAreaWorker(p2lWorker2);
            area.removeAreaWorker(l2sWorker1);
            area.removeAreaWorker(l2sWorker2);

            //包装区
            factory.getPackageArea().setPrice();
            factory.getPackageArea().decorator();
            factory.getPackageArea().packaging();

        }

    }
}
