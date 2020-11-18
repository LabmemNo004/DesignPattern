package BusinessDelegate.Business;

import Chocolate.Chocolate;
import Factory.Factory;
import FactoryParameter.FactoryParameter;

import java.util.ArrayList;

public class DisplayWorkerState implements BusinessService{
    @Override
    public void doProcessing() {
        Factory factory=Factory.getInstance();

        freeList=factory.ChocolateProductionArea.getFreeWorkers();
        busyList=factory.ChocolateProductionArea.getBusyWorkers();

        System.out.println("使用业务代表 Business Delegate 模式");
        System.out.println("通过终端执行\"查看当前工人工作状态");


        System.out.println("当前忙碌工人数量为:"+freeList.size());
        System.out.println("当前空闲工人个数为:"+busyList.size());
    }
}
