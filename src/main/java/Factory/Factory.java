package Factory;

import Chocolate.Chocolate;

import java.io.Serializable;
import java.util.ArrayList;

import Area.ChocolateSellArea;
import Area.ChocolatePackagingArea;
import Area.RawMaterialManagementArea;
import Area.ProcessChocolateArea.ChocolateProductionArea;
import Charlie.Charlie;
import Mediator.ChocolateMediator;






public class Factory implements Serializable {

    private Factory _instance;
    private Charlie _charlie;//工厂主Charlie

    private RawMaterialManagementArea _manageArea;
    private ChocolateProductionArea _productionArea;
    private ChocolatePackagingArea _packagingArea;
    private ChocolateSellArea _sellArea;

    private ChocolateMediator _chocolateMediator;

    private ArrayList<Chocolate> _chocolates;

    /**
     * 构造函数
     */
    private Factory(){
        this._manageArea=new RawMaterialManageArea.getInstance(Charlie.charlie,this);
        this._productionArea=new ChocolateProductionArea.getInstance(Charlie.charlie,this);
        this._packagingArea=ChocolatePackagingArea.getInstance(Charlie.charlie,this);
        this._sellArea=ChocolateSellArea.getInstance(Charlie.charlie,this);
        this._chocolates=new ArrayList<Chocolate.Chocolate>();
        //instance要怎么初始化？
    }

    public Factory getInstace(){
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
        for(Chocolate now:_chocolates){
            now.setMediator(_chocolateMediator);
        }
    }

    /**
     * 为整个工厂分配一个中介者
     */
    public void setMediatorForFactory(ChocolateMediator chocolateMediator){
        this._chocolateMediator = chocolateMediator;    }

    public ArrayList<Chocolate> getChocolates()
    {
        return _chocolates;
    }
}
