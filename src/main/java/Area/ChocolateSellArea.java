package Area;

import Charlie.Charlie;
import Chocolate.Chocolate;
import Factory.Factory;

import java.util.ArrayList;
import java.util.List;

public class ChocolateSellArea extends Area {

    public static ChocolateSellArea getInstance(Charlie charlie,Factory factory)
    {
        //双重检查锁
        if(chocolateSellArea==null)
        {
            synchronized (ChocolateSellArea.class)
            {
                if(chocolateSellArea==null)
                {
                    chocolateSellArea=new ChocolateSellArea(charlie,factory);
                    System.out.println("ChocolateSellArea has been initialized!");
                }
            }
        }
        return chocolateSellArea;
    }


    public ArrayList<Chocolate> getSellAreaChocolates()
    {
        return areaChocolates;
    }

    public void addSellAreaChoclates(ArrayList<Chocolate> chocolates)
    {
        areaChocolates.addAll(chocolates);
    }

    public void addSellAreaChocolate(Chocolate chocolate)
    {
        areaChocolates.add(chocolate);
    }

    public void sellChocolate()
    {
        _charlie.addAccount(getPrice(areaChocolates));
        areaChocolates.clear();
    }

    //获取总售价，interpretor模式
    public Double getPrice(ArrayList<Chocolate> chocolates)
    {
        Double sum_val=0.0;
        for(Chocolate now:chocolates)
        {
            String now_str=now.getSize().toString()+"_"+now.getShape().toString()+"_"+now.getColor().toString();
            //将枚举类型按照 ”大小_形状_颜色“ 的字符串格式返回，用Interpreter模式识别返回价格(Double)
            sum_val+=now.getPriceByInterpretor(now_str);
        }
        System.out.println("售出"+chocolates.size()+"个巧克力，得到"+sum_val+"元");
        return sum_val;
    }

    private ChocolateSellArea(Charlie charlie,Factory factory)
    {
        super("4","ChocolateSellArea",charlie,factory);
        areaChocolates=new ArrayList<Chocolate>();
    }

    private static volatile ChocolateSellArea chocolateSellArea;
    private ArrayList<Chocolate> areaChocolates;
}
