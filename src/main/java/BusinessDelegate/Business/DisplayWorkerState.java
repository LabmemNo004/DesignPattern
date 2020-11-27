package BusinessDelegate.Business;

import Factory.Factory;
import Worker.Worker;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class DisplayWorkerState implements BusinessService{
    @Override
    public void doProcessing() {
        Factory factory=Factory.getInstance();

        List<Object> freeList=factory.getProductionArea().getFreeWorkers();//留言：由于使用扩展对象模式需要修改对象类型
        List<Object> busyList=factory.getProductionArea().getBusyWorkers();//留言：由于使用扩展对象模式需要修改对象类型

        System.out.println("\n========使用业务代表 Business Delegate 模式========");
        System.out.println("=======通过终端执行\"查看当前工人工作状态=======");


        System.out.println("当前忙碌工人数量为:"+busyList.size());
        System.out.println("当前空闲工人个数为:"+freeList.size());

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
