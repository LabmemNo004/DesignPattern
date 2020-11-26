package Area;

import Charlie.Charlie;
import Factory.Factory;

import java.io.Serializable;
import DiningRoom.*;
import SolveStarvation.*;


public class Area implements Serializable {
    public Area(String id,String name,Charlie charlie,Factory factory)
    {
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
}