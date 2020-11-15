package BusinessDelegate.Business;

import Chocolate.Chocolate;
import Factory.Factory;
import FactoryParameter.FactoryParameter;

import java.util.ArrayList;

public class DisplayChocolates implements BusinessService{
    @Override
    public void doProcessing() {
        Factory factory=Factory.getInstance();

        ArrayList<Chocolate> chocolates=factory.getChocolates();

        System.out.println("使用业务代表 Business Delegate 模式");
        System.out.println("通过终端执行\"查看流水线中巧克力");

        int waitProcess=0;
        int waitPackage=0;
        int waitSell=0;
        int hasSell=0;

        for(Chocolate now:chocolates)
        {
            if(now.getState()==FactoryParameter.waitProcess) waitProcess++;
            else if(now.getState()==FactoryParameter.waitPackage) waitPackage++;
            else if(now.getState()==FactoryParameter.waitSell) waitSell++;
            else if(now.getState()==FactoryParameter.hasSell) hasSell++;
            else continue;
        }

        System.out.println("当前工厂流水线中巧克力数为:"+chocolates.size());
        System.out.println("当前流水线总体巧克力状态为: 待生产:"+waitProcess+"; 待加工:"+waitPackage+"; 待销售:"+waitSell+"; 已销售:"+hasSell);
    }
}
