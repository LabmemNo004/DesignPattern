package Factory;

import Chocolate.IChocolate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Area.ChocolateSellArea;
import Area.ChocolatePackagingArea;
import Area.RawMaterialManagementArea;
import Area.ProcessChocolateArea.ChocolateProductionArea;
import FactoryParameter.Parameter;
import Mediator.ChocolateMediator;
import Charlie.Charlie;
import OrganizationComponent.OrganizationComponent;



public class Factory extends OrganizationComponent implements Serializable  {

    private static volatile Factory _instance;
    private Charlie _charlie;//工厂主Charlie

    private RawMaterialManagementArea _manageArea;
    private ChocolateProductionArea _productionArea;
    private ChocolatePackagingArea _packagingArea;
    private ChocolateSellArea _sellArea;

    private ChocolateMediator _chocolateMediator;

    private ArrayList<IChocolate> _chocolates; // 留言：把Chocolate 类改成 IChocolate 接口

    ArrayList<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();


    /**
     * 构造函数
     */
    private Factory(){
        super("factory");
        this._chocolates=new ArrayList<Chocolate.IChocolate>(Parameter.chocolatesCount);
        this._charlie=Charlie.charlie;
        this._manageArea=RawMaterialManagementArea.getInstance(Charlie.charlie,this);
        this._productionArea=ChocolateProductionArea.getInstance(Charlie.charlie,this);
        this._packagingArea=ChocolatePackagingArea.getInstance(Charlie.charlie,this);
        this._sellArea=ChocolateSellArea.getInstance(Charlie.charlie,this);
        organizationComponentList.add(_productionArea);
        organizationComponentList.add(_packagingArea);
        organizationComponentList.add(_sellArea);
    }



    @Override
    protected void add(OrganizationComponent organizationComponent) {
        System.out.println("对不起，由于规模限制，本工厂暂不进行区域扩充");
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        System.out.println("对不起，本工厂暂不进行区域缩减");
    }

    @Override
    public String getName() {
        return super.getName();
    }
    /**
     * 输出工厂包含的所有区域
     */
    public void print() {
        System.out.println("==========="+getName()+"===========");
        for (OrganizationComponent organizationComponent:organizationComponentList) {
            organizationComponent.print();
        }
    }

    public static Factory getInstance() //增加了双重检查锁
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
            if(now.getMediator()==null)
            {
                now.setMediator(_chocolateMediator);
            }
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

    public void setChocolates(ArrayList<IChocolate>chocolates){

        _chocolates.clear();
        for(IChocolate now:chocolates){
            _chocolates.add(now);
        }

    }

}
