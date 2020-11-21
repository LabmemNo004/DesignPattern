package Area;

import Chocolate.IChocolate;
import Factory.Factory;
import Charlie.Charlie;
import java.io.Serializable;
import java.util.ArrayList;
import FactoryParameter.Parameter;
import Interpreter.ParseException;
import Interpreter.Parser;
/*
 额外使用了Charlie类
 */
public class ChocolatePackagingArea extends Area implements Serializable {

    private static volatile ChocolatePackagingArea uniqueArea;//唯一的巧克力包装区实体对象
    private ArrayList<IChocolate> chocolate;//巧克力列表（工厂中的）

    /*
    巧克力包装区构造函数
     */
    private ChocolatePackagingArea(Charlie charlie,Factory factory) {
        super("3","PackagingArea",charlie,factory);
        this.chocolate=factory.getChocolates();//使用了未确定的Factory类的getChocolate()
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
    public void setPrice() throws ParseException {
        for(IChocolate now:chocolate)
        {
            if(now.getState()==2)
            {
                String now_str = now.getSize().toString() + "+" + now.getShape().toString() + "+" + now.getColor().toString();
                //将枚举类型按照 ”大小_形状_颜色“ 的字符串格式返回，用Interpreter模式识别返回价格(Double)
                double chocolateValue = Parser.parse(now_str).interpret();
                now.setPrice(chocolateValue);
                System.out.println("巧克力" + now.getName() + "估值完成，售价" + chocolateValue + "元");
            }
        }
    }

    public void decorator(){


    }











}
