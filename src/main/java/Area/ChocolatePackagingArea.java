package Area;

import Chocolate.IChocolate;
import Factory.Factory;
import Worker.Charlie;
import java.io.Serializable;
import java.util.ArrayList;
import FactoryParameter.Parameter;
import Decorator.*;
import Mediator.ChocolateMediator;
import Memento.PackagingMachine;

/*
 额外使用了Charlie类
 */
public class ChocolatePackagingArea extends Area implements Serializable {

    private static volatile ChocolatePackagingArea uniqueArea;//唯一的巧克力包装区实体对象
    private ArrayList<IChocolate> chocolate;//巧克力列表（工厂中的）
    private PackagingMachine packagingMachine;//巧克力包装机器

    /*
    巧克力包装区构造函数
     */
    private ChocolatePackagingArea(Charlie charlie,Factory factory) {
        super("3","PackagingArea",charlie,factory);
        this.chocolate=factory.getChocolates();
        this.packagingMachine=new PackagingMachine();
        System.out.println("ChocolatePackagingArea has been initialized!");
    }

    /*
    双重检查锁
     */
    public static ChocolatePackagingArea getInstance(Charlie charlie, Factory factory) {
        if (null == uniqueArea) {
            synchronized (ChocolatePackagingArea.class) {
                if (null == uniqueArea) {
                    uniqueArea = new ChocolatePackagingArea(charlie,factory);
                }
            }
        }
        return uniqueArea;
    }

    /*
    获取巧克力个体售价
     */
    public void setPrice()  {
        for(IChocolate now:chocolate)
        {
            if(now.getState()==2)
            {
                double chocolateValue = Parameter.chocolatePrice.get(now.getSize().toString())+Parameter.chocolatePrice.get(now.getShape().toString())+Parameter.chocolatePrice.get(now.getColor().toString());
                now.setPrice(chocolateValue);
                System.out.println("巧克力" + now.getName() + "估值完成，售价" + chocolateValue + "元");
            }
        }
    }

    /*
    Decorator模式
     */
    public void decorator(){
        System.out.println("=====使用Decorator模式=====");
        for(IChocolate now:chocolate)
            if(now.getState()==2)
            {
                int quality=now.getQuality();
                if(quality==1)
                {
                    now=new HqChocolateDecorator(now);
                    System.out.println("该巧克力被分类为优质巧克力");
                }
                else{
                    now=new LqChocolateDecorator(now);
                    System.out.println("该巧克力被分类为劣质巧克力");
                }
            }
    }

    /*
    undo redo 包装 memento模式
     */
    public void packaging(){
        System.out.println("=====使用Memento模式=====");
        for(IChocolate now:chocolate){
            if(now.getState()==2)
            {
                this.packagingMachine.resetMachine(now);
                now.setState(Parameter.decoratedState);
                now.getMediator().colleagueReport();
            }
        }

    }







}
