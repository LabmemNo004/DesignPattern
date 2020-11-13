package Area;

import Charlie.Charlie;
import Chocolate.Chocolate;
import Factory.Factory;

import java.util.ArrayList;

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

    public void sellChocolate(ArrayList<Chocolate> chocolates)
    {
        charlie.addAccount(getPrice(chocolates));
        chocolates.clear();
    }

    //获取总售价，interpretor模式
    public Double getPrice(ArrayList<Chocolate> chocolates)
    {
        return .9;
    }

    private ChocolateSellArea(Charlie charlie,Factory factory)
    {
        super("4","ChocolateSellArea",charlie,factory);
        areaChocolates=new ArrayList<Chocolate>();
    }

    private static volatile ChocolateSellArea chocolateSellArea;
    private ArrayList<Chocolate> areaChocolates;
}
