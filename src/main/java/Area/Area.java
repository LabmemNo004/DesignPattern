package Area;

import Charlie.Charlie;
import Factory.Factory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import DiningRoom.*;
import SolveStarvation.*;
import OrganizationComponent.OrganizationComponent;


public class Area extends OrganizationComponent implements Serializable {
    public Area(String id,String name,Charlie charlie,Factory factory)
    {
        super(name);
        this.areaId=id;
        this.areaName=name;
        this.charlie=charlie;
        this.factory=factory;
        diningRoom=new DiningRoom();//add
    }

    protected String areaId;
    protected String areaName;
    protected Charlie charlie;
    protected Factory factory;
    public DiningRoom diningRoom;//add
    public List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();



    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    /**
     * 输出工厂包含的所有区域
     */
    public void print() {
        System.out.println("***********"+getName()+"****************");
        for (OrganizationComponent organizationComponent:organizationComponentList) {
            organizationComponent.print();
        }
    }


    //add
    public boolean solveStarvation(AreaSolveStarvation handler, Starvation starvation)
    {
        int food_required=starvation._required_food_amount;
        DiningRoom diningroom=handler.area.diningRoom;
        if(diningroom.getFoodAmount() >= food_required)
        {
            diningroom.removeFoodAmount(food_required);
            return true;
        }
        else
        {
            starvation._required_money_amount =  (food_required - diningroom.getFoodAmount()) * 10;//一份餐10元
        }
        return false;
    }
    public String getAreaName()
    {
        return areaName;
    }
}