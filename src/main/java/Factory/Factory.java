package Factory;

import Chocolate.IChocolate;

import java.io.Serializable;
import java.util.ArrayList;

import Area.ChocolateSellArea;
import Area.ChocolatePackagingArea;
import Area.RawMaterialManagementArea;
import Area.ProcessChocolateArea.ChocolateProductionArea;
import Worker.*;//modify by hzj 11-24
import FactoryParameter.Parameter;
import Mediator.ChocolateMediator;



public class Factory implements Serializable {

    private static volatile Factory _instance;
    private Charlie _charlie;//工厂主Charlie

    private RawMaterialManagementArea _manageArea;
    private ChocolateProductionArea _productionArea;
    private ChocolatePackagingArea _packagingArea;
    private ChocolateSellArea _sellArea;

    private ChocolateMediator _chocolateMediator;

    private final ArrayList<IChocolate> _chocolates; // 留言：把Chocolate 类改成 IChocolate 接口
    /**
     * 构造函数
     */
    private Factory(){
        this._chocolates=new ArrayList<Chocolate.IChocolate>(Parameter.chocolatesCount);
        this._charlie=Charlie.getInstance();
        this._manageArea=RawMaterialManagementArea.getInstance(Charlie.getInstance(),this);
        this._productionArea=ChocolateProductionArea.getInstance(Charlie.getInstance(),this);
        this._packagingArea=ChocolatePackagingArea.getInstance(Charlie.getInstance(),this);
        this._sellArea=ChocolateSellArea.getInstance(Charlie.getInstance(),this);
    }

    public static Factory getInstance() //留言：增加了双重检查锁
    {
        //双重检查锁
        if(_instance==null)
        {
            synchronized (Factory.class)
            {
                if(_instance==null)
                {
                    _instance=new Factory();
                    System.out.println("Chocolate Factory has been initialized!");
                }
            }
        }
        return _instance;
    }

    /**
     * 获取中介者
     */
    public ChocolateMediator getChocolateMediator(){
        if (_chocolateMediator == null){
            _chocolateMediator = new ChocolateMediator();
        }
        return _chocolateMediator;
    }

    /**
     * 为工厂中所有的巧克力添加中介者
     */
    public void addMediatorForAll(){
        for(IChocolate now:_chocolates){
            now.setMediator(_chocolateMediator);
        }
    }

    /**
     * 为整个工厂分配一个中介者
     */
    public void setMediatorForFactory(ChocolateMediator chocolateMediator)
    {
        this._chocolateMediator = chocolateMediator;
    }

    public ArrayList<IChocolate> getChocolates()
    {
        return _chocolates;
    }

    public RawMaterialManagementArea getManageArea() {
        return _manageArea;
    }

    public ChocolateProductionArea getProductionArea() {
        return _productionArea;
    }

    public ChocolateSellArea getSellArea() {return _sellArea;}

    public void setCharlie(Charlie charlie)
    {
        _charlie=charlie;
    }

    public Charlie getCharlie()
    {
        return _charlie;
    }
    public ChocolatePackagingArea getPackageArea() {return _packagingArea;}

}
