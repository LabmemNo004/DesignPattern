package Mediator;

import Chocolate.IChocolate;
import Factory.Factory;
import FactoryParameter.Parameter;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ChocolateMediator implements Mediator{

    //巧克力中介者创建组员
    @Override
    public void createColleague() {
        _chocolates=factory.getChocolates();
    }

    //组员报告
    @Override
    public void colleagueReport()
    {
        System.out.println("\n=========使用 中介者 Mediator模式=========");
        if(_chocolates==null)
        {
            System.out.println("工厂巧克力列表为空");
            return;
        }
        for(IChocolate now:_chocolates)
        {
            if(now.getState()== Parameter.decoratedState)
            {
                _waitSellChocolates.add(now);
                now.setState(Parameter.waitSoldState);
            }
        }//等待达到阈值
        if(_waitSellChocolates.size()>=threshold)
        {
            for(IChocolate now:_chocolates)
            {
                if(now.getState()== Parameter.waitSoldState)
                {
                    now.setState(Parameter.soldState);
                }
            }//等待达到阈值
            factory.getSellArea().addSellAreaChoclates(_waitSellChocolates);
            factory.getSellArea().sellChocolate();
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
        if(_chocolates!=null)
        {
            for(IChocolate now:_chocolates)
            {
                if(now.getState()== Parameter.waitSoldState)
                {
                    _waitSellChocolates.add(now);
                }
            }
        }
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
