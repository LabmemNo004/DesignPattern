package Area;

import java.util.ArrayList;
import java.util.List;

import Charlie.Charlie;
import Chocolate.Material;
import Factory.Factory;
import Observer.MaterialObservable;
import Observer.MaterialObserver;
import Chocolate.Color.Colors;


public class RawMaterialManagementArea extends Area  implements MaterialObservable{
    private Material blackMaterial=new Material(1,20);//用了单例模式就不用设为静态
    private Material whiteMaterial=new Material(2,20);//用了单例模式就不用设为静态
    private volatile static RawMaterialManagementArea ourInstance;
    private List<MaterialObserver> observers = new ArrayList<>();

    public static RawMaterialManagementArea getInstance(Charlie charlie,Factory factory) {
        if (null == ourInstance) {
            synchronized (RawMaterialManagementArea.class) {
                if (null == ourInstance) {
                    ourInstance = new RawMaterialManagementArea(charlie,factory);
                    System.out.println("RawMaterialManagementArea has been initialized!");
                }
            }
        }
        return ourInstance;
    }

    private RawMaterialManagementArea(Charlie charlie,Factory factory) {
        super("1","RawMaterialManagementArea",charlie,factory);
    }

    public int getBlackMaterialNum(){
        return blackMaterial.getNum();
    }

    public int getWhiteMaterialNum(){
        return whiteMaterial.getNum();
    }



    public void blackProduce(){//用了单例就不用静态
        if(blackMaterial.getNum()>=1)
        {
            blackMaterial.reduce(1);
        }
        else
        {
            System.out.println("黑巧克力原料不足！");
            notifyAllObservers(blackMaterial, Colors.black);
        }
    }
    public void whiteProduce(){//用了单例就不用静态
        if(whiteMaterial.getNum()>=1)
        {
            whiteMaterial.reduce(1);
        }
        else
        {
            System.out.println("白巧克力原料不足！");
            notifyAllObservers(whiteMaterial, Colors.white);
        }
    }

    //留言：以下属于观察者模式
    @Override
    public void addObserber(MaterialObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MaterialObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(Material material,Colors color) {
        for(MaterialObserver observer:observers){
            observer.update(material,color);
        }
    }
}
