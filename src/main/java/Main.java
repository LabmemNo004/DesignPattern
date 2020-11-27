import Area.ChocolatePackagingArea;
import Area.ChocolateSellArea;
import Area.ProcessChocolateArea.ChocolateProductionArea;
import Area.ProcessChocolateArea.ProcessFacade;
import BusinessDelegate.BusinessDelegate;
import BusinessDelegate.Client;
import Dao.FactoryDao;
import Dao.FactoryDaoImpl;
import Factory.Factory;
import FactoryParameter.Parameter;
import Mediator.ChocolateMediator;
import Worker.Attribute;
import Worker.Extension;
import Charlie.Charlie;
import Worker.LiquidToSolidWorker;
import Worker.PowderToLiquidWorker;
import Command.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

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
        ChocolateProductionArea productionArea = factory.getProductionArea();//获取唯一生产区

        //业务代理模式初始化，无需改动位置，可供查看工厂中_chocolates状态与生产区工人空闲与忙碌状态
        BusinessDelegate businessDelegate = new BusinessDelegate();
        Client client = new Client(businessDelegate);


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


        ChocolateSellArea sellArea = factory.getSellArea();//获取唯一销售区
        ChocolatePackagingArea packagingArea = factory.getPackageArea();//获取唯一包装区

        // 中介者模式
        ChocolateMediator chocolateMediator = new ChocolateMediator();//初始化中介者
        chocolateMediator.setFactory(factory);
        factory.setMediatorForFactory(chocolateMediator);

        while(true) {
            System.out.println("\n\n======================================查理的巧克力工厂==========================================");
            System.out.println("========= 查理经营着世界最先进的巧克力工厂,查理可以使用一些命令来控制工厂的生产以及获得工厂的一些信息 =========");
            System.out.println("=========                            查理可以使用的命令如下                             =========");
            System.out.println("=========                                  命令:                                    =========");
            System.out.println("=========                              1.开始生产巧克力                               =========");
            System.out.println("=========                              2.显示工厂巧克力状态                            =========");
            System.out.println("=========                              3.显示工厂工人状态                              =========");
            System.out.println("=========                              4.显示工厂原料状态                              =========");
            System.out.println("=========                              5.显示账户状态                                 =========");
            System.out.println("=========                              6.保存当前工厂状态                              =========");
            System.out.println("=========                              7.加载已保存的工厂                              =========");
            System.out.println("=========                              8.离开工厂                                    =========");
            System.out.println("=========                              输入命令编号n，执行命令                          =========");
            System.out.println("==============================================================================================");
            System.out.println("请输入命令编号：");
            Scanner inputOut = new Scanner(System.in);
            String inputChoice = inputOut.next();



            if(inputChoice.equals("1")) {

            while (true) {

                // 中介者模式
                ProduceCommand produceCommand =new  ProduceCommand();

                //这一段代码可以加在任何区域代码之中
                System.out.println("业务代理模式查看工厂巧克力状态");
                businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_CHOCOLATE);
                client.doTask();

                System.out.println("业务代理模式查看原料状态");
                businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_MATERIAL);
                client.doTask();

                //分配到各个区域
                productionArea.addAreaWorker(p2lWorker1);
                productionArea.addAreaWorker(Superp2lWorker2);
                productionArea.addAreaWorker(l2sWorker1);
                productionArea.addAreaWorker(Superl2sWorker2);


                ProcessFacade facade = new ProcessFacade();
                produceCommand.startProduce(facade);
                System.out.println("======使用命令模式======");
                System.out.println("======更改了生成许可======");
                facade.produceChocolate();//生产函数

                //这一段代码必须加在生产区域代码之中
                System.out.println("业务代理模式查看工人状态");

                businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_WORKERS);
                client.doTask();

                //回收到总生产区
                productionArea.removeAreaWorker(p2lWorker1);
                productionArea.removeAreaWorker(Superp2lWorker2);
                productionArea.removeAreaWorker(l2sWorker1);
                productionArea.removeAreaWorker(Superl2sWorker2);



                //业务代理模式，这一段代码可以加在任何区域代码之中
                System.out.println("======使用业务代理模式 Businesses Delegate 查看工厂巧克力状态 ======");
                businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_CHOCOLATE);
                client.doTask();


                factory.addMediatorForAll();
                packagingArea.setPrice();
                packagingArea.decorator();
                packagingArea.packaging();


                //业务代理模式，这一段代码可以加在任何区域代码之中
                System.out.println("======使用业务代理模式 Businesses Delegate 查看工厂巧克力状态 ======");
                businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_CHOCOLATE);
                client.doTask();

                System.out.println("======使用业务代理模式 Businesses Delegate 查看原料状态 ======");
                businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_MATERIAL);
                client.doTask();

                System.out.println("\n========当前余额——" + Charlie.charlie.getAccount() + "========");

                sellArea.clearSoldChocolates();

                System.out.println("\n\n==========================选择进入下一轮流水线==========================\n");

                boolean symbol = false;
                while (true) {
                    System.out.println("==========是否继续:?y/n==========");
                    Scanner input = new Scanner(System.in);
                    String inputStr = input.next();
                    switch (inputStr) {
                        case "y":
                        case "yes":
                        case "1":
                            symbol = false;
                            break;
                        case "n":
                        case "no":
                        case "0":
                            symbol = true;
                            break;
                        default:
                            continue;
                    }
                    break;
                }
                if (symbol) {
                    break;
                }

                System.out.println("\n\n==========================进入下一轮流水线==========================\n");
            }
            }


            //业务代理模式
            else if(inputChoice.equals("2")){
                System.out.println("======使用业务代理模式 Businesses Delegate 查看工厂巧克力状态 ======");

                businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_CHOCOLATE);
                client.doTask();
            }


            //业务代理模式
            else if(inputChoice.equals("3")){
                System.out.println("======使用业务代理模式 Businesses Delegate 查看工人状态 ======");
                businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_WORKERS);
                client.doTask();
            }
            //业务代理模式
            else if(inputChoice.equals("4"))
            {
                System.out.println("======使用业务代理模式 Businesses Delegate 查看原料状态 ======");

                businessDelegate.setBusinessService(Parameter.SERVICE_DISPLAY_MATERIAL);
                client.doTask();
            }

            else if(inputChoice.equals("5")){
                System.out.println("\n\n========当前余额——" + Charlie.charlie.getAccount() + "========");
            }


            else if(inputChoice.equals("6")){
                FactoryDao factoryDao = new FactoryDaoImpl();
                factoryDao.updateFactory(factory);
                System.out.println("巧克力工厂数据保存成功");
            }

            else if(inputChoice.equals("7")){
                FactoryDao factoryDao = new FactoryDaoImpl();
                Factory factory1= factoryDao.getFactory();
                if(factory1==null){
                    System.out.println("巧克力工厂数据加载失败，请重新存档");

                }
                else {
                    Charlie.charlie.setAccount(factory1.getCharlie().getAccount());
                    factory.setChocolates(factory1.getChocolates());
                    factory.getManageArea().setBlackMaterialNum(factory1.getManageArea().getBlackMaterialNum());
                    factory.getManageArea().setWhiteMaterialNum(factory1.getManageArea().getWhiteMaterialNum());
                    System.out.println("巧克力工厂数据加载成功");
                }
            }


            else if(inputChoice.equals("8")){
                System.out.println("查理休假=====================程序结束");
                break;
            }

            else{
                System.out.println("请输入正确的命令码");
            }


        }
    }
}
            /*
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
            ChocolateMediator chocoMediator = new ChocolateMediator();
            chocoMediator.setFactory(factory);
            factory.setMediatorForFactory(chocolateMediator);
            factory.addMediatorForAll();

            //单例模式
            System.out.println("======== 使用 单例Singleton 模式 ========");
            System.out.println("");
            Charlie charlie = Charlie.getInstance();
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
            // 扩展对象 Extension objects 模式
            System.out.println("======== 扩展对象 Extension objects 模式 ========");
            System.out.println("");
            Extension plusl2sWorker2 = l2sWorker2.GetExtensionWorker();
            productionAreaarea.addFreeWorker(plusl2sWorker2);

            //输出工人列表信息
            System.out.println(productionAreaarea.getFreeWorkers().size());
            System.out.println(productionAreaarea.getBusyWorkers().size());
            //分配到各个区域
            productionAreaarea.addAreaWorker(p2lWorker1);
            productionAreaarea.addAreaWorker(p2lWorker2);
            productionAreaarea.addAreaWorker(l2sWorker1);
            productionAreaarea.addAreaWorker(l2sWorker2);
            System.out.println(productionAreaarea.getFreeWorkers().size());
            System.out.println(productionAreaarea.getBusyWorkers().size());
            System.out.println(productionAreaarea.getMeltArea().getWorkers().size());
            System.out.println(productionAreaarea.getFreezeArea().getWorkers().size());
            ProcessFacade facade1 = new ProcessFacade();
            facade1.produceChocolate();//生产函数
            productionAreaarea.removeAreaWorker(p2lWorker1);
            productionAreaarea.removeAreaWorker(p2lWorker2);
            productionAreaarea.removeAreaWorker(l2sWorker1);
            productionAreaarea.removeAreaWorker(l2sWorker2);
            System.out.println(productionAreaarea.getFreeWorkers().size());
            System.out.println(productionAreaarea.getBusyWorkers().size());
            System.out.println(productionAreaarea.getMeltArea().getWorkers().size());
            System.out.println(productionAreaarea.getFreezeArea().getWorkers().size());
            System.out.println(factory.getChocolates().size());

            //责任链模式
            System.out.println("======== 使用 责任链Responsibility 模式 ========");
            System.out.println("");


            //规约模式

            String[] chocolateTag = {
                    "质量为低的大巧克力",
                    "质量为低的中巧克力",
                    "质量为低的小巧克力",
                    "质量为中的大巧克力",
                    "质量为中的中巧克力",
                    "质量为中的小巧克力",
                    "质量为高的大巧克力",
                    "质量为高的中巧克力",
                    "质量为高的小巧克力"
            };
            Chocolate[] chocolates = {new Chocolate(), new Chocolate(), new Chocolate(), new Chocolate(), new Chocolate()
                    , new Chocolate(), new Chocolate(), new Chocolate(), new Chocolate()};
            chocolates[0].setQuality(1);
            chocolates[0].setSize(Mould.Size.big);
            chocolates[1].setQuality(1);
            chocolates[1].setSize(Mould.Size.middle);
            chocolates[2].setQuality(1);
            chocolates[2].setSize(Mould.Size.small);
            chocolates[3].setQuality(2);
            chocolates[3].setSize(Mould.Size.big);
            chocolates[4].setQuality(2);
            chocolates[4].setSize(Mould.Size.middle);
            chocolates[5].setQuality(2);
            chocolates[5].setSize(Mould.Size.small);
            chocolates[6].setQuality(3);
            chocolates[6].setSize(Mould.Size.big);
            chocolates[7].setQuality(3);
            chocolates[7].setSize(Mould.Size.middle);
            chocolates[8].setQuality(3);
            chocolates[8].setSize(Mould.Size.small);

            for (int i = 0; i < chocolates.length; i++) {
                chocolates[i].getSize();
                System.out.println("生成巧克力" + chocolateTag[i] + "@" + chocolates[i].hashCode());

            }

            BigSizeSpecification isBig = new BigSizeSpecification();
            HighQualitySpecification isHighQua = new HighQualitySpecification();
            System.out.println("新建规约类 BigSizeSpecification@" + isBig.hashCode() + " 和HighQualitySpecification@" + isHighQua.hashCode());

            System.out.println("组合得到四个具体规约法则。");
            Specification big_high = isBig.and(isHighQua);
            System.out.println("big_high@" + big_high.hashCode());
            Specification big_not_high = isBig.and(isHighQua.not());
            System.out.println("big_not_high@" + big_not_high.hashCode());
            Specification not_big_high = isBig.not().and(isHighQua);
            System.out.println("not_big_high@" + not_big_high.hashCode());
            Specification not_big_not_high = isBig.not().and(isHighQua.not());
            System.out.println("not_big_not_high@" + not_big_not_high.hashCode());

            System.out.println("开始筛选：");
            System.out.println("1. 使用规约模式big_high筛选质量高的大巧克力。");
            for (int i = 0; i < chocolates.length; i++) {
                if (big_high.isSatisfiedBy(chocolates[i])) {
                    System.out.println("筛选出:" + chocolateTag[i] + " @" + chocolates[i].hashCode());
                }
            }
            System.out.println("2. 使用规约模式big_not_high筛选质量中下的大巧克力。");
            for (int i = 0; i < chocolates.length; i++) {
                if (big_not_high.isSatisfiedBy(chocolates[i])) {
                    System.out.println("筛选出:" + chocolateTag[i] + " @" + chocolates[i].hashCode());
                }
            }
            System.out.println("3. 使用规约模式not_big_high筛选质量高的中小巧克力。");
            for (int i = 0; i < chocolates.length; i++) {
                if (not_big_high.isSatisfiedBy(chocolates[i])) {
                    System.out.println("筛选出:" + chocolateTag[i] + " @" + chocolates[i].hashCode());
                }
            }
            System.out.println("4. 使用规约模式not_big_not_high筛选质量中下的中小巧克力。");
            for (int i = 0; i < chocolates.length; i++) {
                if (not_big_not_high.isSatisfiedBy(chocolates[i])) {
                    System.out.println("筛选出:" + chocolateTag[i] + " @" + chocolates[i].hashCode());
                }
            }



            //原型模式
            System.out.println("======== 使用 原型Prototype 模式 ========");
            System.out.println("");
            Mould bigStarWhiteMould = MouldCahce.getShape("bigStarWhite");
            System.out.println("验证通过原型模式clone出的bigStarWhite模型的信息：");
            bigStarWhiteMould.getInfo();
            Mould bigHeartWhiteMould = MouldCahce.getShape("bigHeartWhite");
            System.out.println("验证通过原型模式clone出的bigHeartWhite模型的信息：");
            bigStarWhiteMould.getInfo();
            //建造者模式
            System.out.println("======== 使用 建造者Builder 模式 ========");
            System.out.println("");

            Director director = new Director();

            WorkerBuilder powderToLiquidWorkerBuilder = new PowderToLiquidWorkerBuilder();
            director.setBuilder(powderToLiquidWorkerBuilder);
            director.constructWorker();
            Worker worker1 = director.getWorker();
            System.out.println(director.toStringZh());
            System.out.println("");

            WorkerBuilder liquidToSolidWorkerBuilder = new LiquidToSolidWorkerBuilder();
            director.setBuilder(liquidToSolidWorkerBuilder);
            director.constructWorker();
            Worker worker2 = director.getWorker();
            System.out.println(director.toStringZh());
            System.out.println("");

            //转换器模式
            System.out.println("======== 使用 Converter 转换器模式 ========");
            System.out.println("");
            Chocolate convertchoco = new Chocolate();
            BigMould bigStarBlackMould = new BigMould(new StarShaped(), new BlackColor());
            //用模具初始化巧克力
            convertchoco.setSSC(bigStarBlackMould);
            SimiFinishedChocolate memento = SimiFinishedChocolate.getMemento(convertchoco);
            ChocolateConverter converter = new ChocolateConverter();
            Chocolate chocolate1 = converter.convertFromDto(memento);
            if (chocolate1.getState() == memento.getState()
                    && chocolate1.getColor() == memento.getColor()
                    && chocolate1.getShape() == memento.getShape()
                    && chocolate1.getSize() == memento.getSize())
                System.out.println("从dto转化为实体对象转换成功");
            SimiFinishedChocolate simiFinishedChocolate = converter.convertFromEntity(convertchoco);
            if (convertchoco.getState() == simiFinishedChocolate.getState()
                    && convertchoco.getColor() == simiFinishedChocolate.getColor()
                    && convertchoco.getShape() == simiFinishedChocolate.getShape()
                    && convertchoco.getSize() == simiFinishedChocolate.getSize())
                System.out.println("从实体对象转化为dto对象转换成功");


            //使用 Template method 模式
            System.out.println("======== 使用 Template method 模式 ========");
            System.out.println("");
            Attribute attribute1 = new Attribute("007", "2000.01.01", "male", 5000);
            PowderToLiquidWorker tpworker1 = new PowderToLiquidWorker(attribute1, "PowderToLiquid");
            Attribute attribute2 = new Attribute("008", "2001.01.01", "female", 5000);
            LiquidToSolidWorker tpworker2 = new LiquidToSolidWorker(attribute2, "LiquidToSolid");
            Chocolate tmpchocolate1 = new Chocolate();
            SmallMould smallStarWhiteMould = new SmallMould(new StarShaped(), new WhiteColor());
            chocolate1.setProduceStrategy(smallStarWhiteMould);
            chocolate1.setSSC(smallStarWhiteMould);
            Chocolate tmpchocolate2 = tpworker1.work(tmpchocolate1);
            tpworker2.work(tmpchocolate2, smallStarWhiteMould);


            //系统结束时保存Factory
            //使用 数据访问对象（DAO） 模式
            System.out.println("======== 使用 DAO 模式 ========");
            FactoryDao factoryDao = new FactoryDaoImpl();
            factoryDao.updateFactory(factory);
            System.out.println("巧克力工厂数据保存成功");
            */

