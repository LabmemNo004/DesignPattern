import BusinessDelegate.BusinessDelegate;
import BusinessDelegate.Client;
import Factory.Factory;
import FactoryParameter.Parameter;
import Mediator.ChocolateMediator;

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


    }
}
