package BusinessDelegate.Business;


import Area.RawMaterialManagementArea;
import Factory.Factory;

import java.util.concurrent.TimeUnit;

public class DisplayMaterial implements BusinessService {
    @Override
    public void doProcessing() {
        Factory factory=Factory.getInstance();

        RawMaterialManagementArea area=factory.getManageArea();

        System.out.println("\n========使用业务代表 Business Delegate 模式========");
        System.out.println("========通过终端执行\"查看流水线中原料========");

        int black= area.getBlackMaterialNum();
        int white= area.getWhiteMaterialNum();

        System.out.println("当前工厂流水线中白色巧克力原料剩余:"+white);
        System.out.println("当前工厂流水线中黑色巧克力原料剩余:"+black);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
