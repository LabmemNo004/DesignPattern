package Area;

import Chocolate.Chocolate;
import Factory.Factory;//未确定的类
import Factory.Charlie;//未确定的类
import java.io.Serializable;
import java.util.List;
/*
 额外使用了Charlie类
 */
public class ChocolatePackagingArea extends Area implements Serializable {

    private volatile static ChocolatePackagingArea uniqueArea;//唯一的巧克力包装区实体对象
    private List<Chocolate> chocolate;//巧克力列表（工厂中的）

    /*
    巧克力包装区构造函数
     */
    private ChocolatePackagingArea(Charlie charlie,Factory factory) {
        super("3","PackagingArea",charlie,factory);
        this.chocolate=factory.getChocolate();//使用了未确定的Factory类的getChocolate()
    }

    /*
    双重检查锁
     */
    public ChocolatePackagingArea getInstance(Charlie charlie,Factory factory) {
        if (null == uniqueArea) {
            synchronized (ChocolatePackagingArea.class) {
                if (null == uniqueArea) {
                    uniqueArea = new ChocolatePackagingArea(charlie,factory);
                }
            }
        }
        return uniqueArea;
    }










}
