package BusinessDelegate.Business;

import Chocolate.IChocolate;
import Factory.Factory;
import FactoryParameter.Parameter;
import State.*;

import java.util.ArrayList;

public class DisplayChocolates implements BusinessService{
    @Override
    public void doProcessing() {
        Factory factory=Factory.getInstance();

        ArrayList<IChocolate> chocolates=factory.getChocolates();//留言：Chocolate -->IChocolate

        System.out.println("使用业务代表 Business Delegate 模式");
        System.out.println("通过终端执行\"查看流水线中巧克力");

        int waitProcess=0;
        int waitPackage=0;
        int waitSell=0;
        int hasSell=0;

        for(IChocolate now:chocolates)
        {
            if(now.getState().stateValue== Parameter.powerState||now.getState().stateValue== Parameter.liquidState) waitProcess++;
            else if(now.getState().stateValue== Parameter.producedState) waitPackage++;
            else if(now.getState().stateValue== Parameter.decoratedState) waitSell++;
            else if(now.getState().stateValue== Parameter.soldState) hasSell++;
            else continue;
        }

        System.out.println("当前工厂流水线中巧克力数为:"+chocolates.size());
        System.out.println("当前流水线总体巧克力状态为: 待生产:"+waitProcess+"; 待加工:"+waitPackage+"; 待销售:"+waitSell+"; 已销售:"+hasSell);
    }
}
