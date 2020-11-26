package BusinessDelegate.Business;

import Factory.Factory;
import Worker.Worker;

import java.util.List;


public class DisplayWorkerState implements BusinessService{
    @Override
    public void doProcessing() {
        Factory factory=Factory.getInstance();

        List<Worker> freeList=factory.getProductionArea().getFreeWorkers();
        List<Worker> busyList=factory.getProductionArea().getBusyWorkers();

        System.out.println("\n========使用业务代表 Business Delegate 模式========");
        System.out.println("=======通过终端执行\"查看当前工人工作状态=======");


        System.out.println("当前忙碌工人数量为:"+freeList.size());
        System.out.println("当前空闲工人个数为:"+busyList.size());
    }
}
