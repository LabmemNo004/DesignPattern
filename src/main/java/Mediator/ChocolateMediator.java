package Mediator;

import Chocolate.Chocolate;
import Factory.Factory;

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
        for(Chocolate now:_chocolates)
        {
            if(now.getType()==3)
            {
                _waitSellChocolates.add(now);
                now.setType(4);
            }
        }//等待达到阈值
        if(_waitSellChocolates.size()>=threshold)
        {
            factory.chocolateSellArea.addSellAreaChoclates(_waitSellChocolates);
            factory.chocolateSellArea.sellChocolate();
            //巧克力已售出，清空巧克力列表的已售出巧克力
            for(Chocolate now:_chocolates)
            {
                if(now.getType()==4) _chocolates.remove(now);
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
        _waitSellChocolates=new ArrayList<Chocolate>();
        System.out.println("ChocolateMediator has been initialized!");
    }

    //获取待运送至销售区的巧克力
    public List<Chocolate> getWaitSellChocolates()
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
    private ArrayList<Chocolate>_chocolates;
    private ArrayList<Chocolate> _waitSellChocolates;
}
