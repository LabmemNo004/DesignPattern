import Area.ProcessChocolateArea.ChocolateProductionArea;
<<<<<<< HEAD
import Area.ProcessChocolateArea.MeltArea;
=======
>>>>>>> eb81c993058768d57246cbdd2771cbc1d9f43e85
import Area.ProcessChocolateArea.ProcessFacade;
import BusinessDelegate.BusinessDelegate;
import BusinessDelegate.Client;
import Factory.Factory;
import FactoryParameter.Parameter;
import Mediator.ChocolateMediator;
<<<<<<< HEAD
import AbstractFactory.*;
import Area.*;
import Builder.*;
import BusinessDelegate.*;
import CallBack.*;
import Chocolate.*;
import Color.*;
import Command.*;
import Converter.*;
import Criteria.*;
import Dao.FactoryDaoImpl;
import Dao.FactoryDao;
import Decorator.*;
import Decorator.*;
import DeFactory.*;
import DiningRoom.*;
import Factory.*;
import FactoryParameter.*;
import Interpreter.*;
import Item.*;
import Iterator.*;
import Land.*;
import Material.*;
import Mediator.*;
import Memento.*;
import Mould.*;
import Observer.*;
import Pocket.*;
import Prototype.*;
import Proxy.*;
import Shaped.*;
import SolveStarvation.*;
import Specification.*;
import Specification.DetailedSpecification.BigSizeSpecification;
import Specification.DetailedSpecification.HighQualitySpecification;
import State.*;
import Strategy.*;
import Visitor.*;
import Worker.*;

=======
import Worker.Attribute;
import Worker.LiquidToSolidWorker;
import Worker.PowderToLiquidWorker;
>>>>>>> eb81c993058768d57246cbdd2771cbc1d9f43e85

public class Main {
    public static void main(String[] args){

        // 初始化工厂，根据调用关系先后用到了以下设计模式：
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

<<<<<<< HEAD

        //工厂模式
        System.out.println("======== 使用 工厂Factory 模式 ========");
        System.out.println("");
        DeFactory fieldFactory = new FieldFactory();
        Field field1 = (Field) fieldFactory.create("building ChocolatePackagingArea");
        System.out.println("Create a field for " + field1.getUsage() + ".");
        field1.use();
        Field field2 = (Field) fieldFactory.create("building ChocolateSellArea");
        System.out.println("Create a field for " + field2.getUsage() + ".");
        field2.use();
        Field field3 = (Field) fieldFactory.create("building RawMaterialManagementArea");
        System.out.println("Create a field for " + field3.getUsage() + ".");
        field3.use();

        DeFactory largeFieldFactory = new LargeFieldFactory();
        LargeField largeField1 = (LargeField) largeFieldFactory.create("building ChocolateProductionArea");
        System.out.println("Create a large field for " + largeField1.getUsage() + ".");
        largeField1.use();

        // 中介者模式
        ChocolateMediator chocolateMediator = new ChocolateMediator();
        chocolateMediator.setFactory(factory);
        factory.setMediatorForFactory(chocolateMediator);
        factory.addMediatorForAll();

        //单例模式
        System.out.println("======== 使用 单例Singleton 模式 ========");
        System.out.println("");
        Charlie charlie=Charlie.getInstance();
        factory.setCharlie(charlie);
        charlie.setFactory(factory);

        // 生产过程
        // 外观模式
        // 过滤器模式
        // 装饰器模式
        // 包装memento模式
        // interpretor模式
        // 观察者模式
        // 回调模式
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

        // 扩展对象 Extension objects 模式
        System.out.println("======== 扩展对象 Extension objects 模式 ========");
        System.out.println("");
        Extension plusl2sWorker2=l2sWorker2.GetExtensionWorker();
        area.addFreeWorker(plusl2sWorker2);

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
        System.out.println(factory.getChocolates().size());

        //责任链模式
        System.out.println("======== 使用 责任链Responsibility 模式 ========");
        System.out.println("");



        //原型模式
        System.out.println("======== 使用 原型Prototype 模式 ========");
        System.out.println("");
        Mould bigStarWhiteMould=MouldCahce.getShape("bigStarWhite");
        System.out.println("验证通过原型模式clone出的bigStarWhite模型的信息：");
        bigStarWhiteMould.getInfo();
        Mould bigHeartWhiteMould=MouldCahce.getShape("bigHeartWhite");
        System.out.println("验证通过原型模式clone出的bigHeartWhite模型的信息：");
        bigStarWhiteMould.getInfo();
        //建造者模式
        System.out.println("======== 使用 建造者Builder 模式 ========");
        System.out.println("");

        Director director = new Director();

        WorkerBuilder powderToLiquidWorkerBuilder = new PowderToLiquidWorkerBuilder();
        director.setBuilder( powderToLiquidWorkerBuilder );
        director.constructWorker();
        Worker worker1 = director.getWorker();
        System.out.println( director.toStringZh() );
        System.out.println("");

        WorkerBuilder liquidToSolidWorkerBuilder = new LiquidToSolidWorkerBuilder();
        director.setBuilder( liquidToSolidWorkerBuilder );
        director.constructWorker();
        Worker worker2 = director.getWorker();
        System.out.println( director.toStringZh());
        System.out.println("");

        //转换器模式
        System.out.println("======== 使用 Converter 转换器模式 ========");
        System.out.println("");
        Chocolate convertchoco = new Chocolate();
        BigMould bigStarBlackMould=new BigMould(new StarShaped(),new BlackColor());
        //用模具初始化巧克力
        convertchoco.setSSC(bigStarBlackMould);
        SimiFinishedChocolate memento = SimiFinishedChocolate.getMemento(convertchoco);
        ChocolateConverter converter = new ChocolateConverter();
        Chocolate chocolate1=converter.convertFromDto(memento);
        if(chocolate1.getState()==memento.getState()
                &&chocolate1.getColor()==memento.getColor()
                &&chocolate1.getShape()==memento.getShape()
                &&chocolate1.getSize()==memento.getSize())
            System.out.println("从dto转化为实体对象转换成功");
        SimiFinishedChocolate simiFinishedChocolate=converter.convertFromEntity(convertchoco);
        if(convertchoco.getState()==simiFinishedChocolate.getState()
                &&convertchoco.getColor()==simiFinishedChocolate.getColor()
                &&convertchoco.getShape()==simiFinishedChocolate.getShape()
                &&convertchoco.getSize()==simiFinishedChocolate.getSize())
            System.out.println("从实体对象转化为dto对象转换成功");


        //使用 Template method 模式
        System.out.println("======== 使用 Template method 模式 ========");
        System.out.println("");
        Attribute attribute1=new Attribute("007","2000.01.01","male",5000);
        PowderToLiquidWorker tpworker1=new PowderToLiquidWorker(attribute1,"PowderToLiquid");
        Attribute attribute2=new Attribute("008","2001.01.01","female",5000);
        LiquidToSolidWorker tpworker2=new LiquidToSolidWorker(attribute2,"LiquidToSolid");
        Chocolate tmpchocolate1=new Chocolate();
        SmallMould smallStarWhiteMould=new SmallMould(new StarShaped(),new WhiteColor());
        chocolate1.setProduceStrategy(smallStarWhiteMould);
        chocolate1.setSSC(smallStarWhiteMould);
        Chocolate tmpchocolate2=tpworker1.work(tmpchocolate1);
        tpworker2.work(tmpchocolate2,smallStarWhiteMould);


        //系统结束时保存Factory
        //使用 数据访问对象（DAO） 模式
        System.out.println("======== 使用 DAO 模式 ========");
        FactoryDao factoryDao=new FactoryDaoImpl();
        factoryDao.updateFactory(factory);
        System.out.println("巧克力工厂数据保存成功");

=======
            //包装区
            factory.getPackageArea().setPrice();
            factory.getPackageArea().decorator();
            factory.getPackageArea().packaging();

        }
>>>>>>> eb81c993058768d57246cbdd2771cbc1d9f43e85

    }
}
