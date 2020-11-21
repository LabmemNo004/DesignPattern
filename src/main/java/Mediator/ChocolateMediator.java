package Mediator;

import Chocolate.IChocolate;
import Factory.Factory;
import FactoryParameter.FactoryParameter;

import java.util.ArrayList;
import java.util.List;

public class ChocolateMediator implements Mediator{

    //巧克力中介者创建组员
    @Override
    public void createColleague() {
        _chocolates=factory.getChocolates();
    }

    //组员报告
    @Override
    public void colleagueReport() {
        System.out.println("使用Mediator模式");
        if(_chocolates==null)
        {
            System.out.println("工厂巧克力列表为空");
            return;
        }
        for(IChocolate now:_chocolates)
        {
            if(now.getState()== FactoryParameter.decoratedState)
            {
                _waitSellChocolates.add(now);
                now.setState(FactoryParameter.soldState);//或者是State模式的jump()
            }
        }//等待达到阈值
        if(_waitSellChocolates.size()>=threshold)
        {
            factory.getSellArea().addSellAreaChoclates(_waitSellChocolates);
            factory.getSellArea().sellChocolate();
            //巧克力已售出，清空巧克力列表的已售出巧克力
            for(IChocolate now:_chocolates)
            {
                if(now.getState()==FactoryParameter.soldState) _chocolates.remove(now);
            }
            _waitSellChocolates.clear();
            System.out.println("巧克力已从包装区运送到销售区");
        }
        else{
            System.out.println("目前已包装巧克力数为:"+_waitSellChocolates.size()+"，等待统一运送");
        }
    }


    public ChocolateMediator()
    {
        threshold=30;
        _waitSellChocolates=new ArrayList<IChocolate>();
        System.out.println("ChocolateMediator has been initialized!");
    }

    //获取待运送至销售区的巧克力
    public List<IChocolate> getWaitSellChocolates()
    {
        return _waitSellChocolates;
    }

    //巧克力中介者管理工厂的巧克力
    public void setFactory(Factory factory)
    {
        this.factory=factory;
        createColleague();
        if(_chocolates==null)
        {
            System.out.println("目前工厂里没有巧克力");
        }
    }

    private Factory factory;
    private int threshold=0;
    private ArrayList<IChocolate>_chocolates;
    private ArrayList<IChocolate> _waitSellChocolates;//留言：
}
