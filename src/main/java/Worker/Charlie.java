package Worker;


import Worker.Attribute.*;
import java.io.Serializable;
import SolveStarvation.*;
import DiningRoom.*;
import Area.*;

public class Charlie extends Person implements Serializable {
    private static Charlie instance=new Charlie();
    private double account;

    private Charlie()
    {
        super(new Attribute("0001","2020-10-01","man",10000));
        account=1000;
    }

    public static Charlie getInstance()
    {
        System.out.println("=====使用单例模式=====");
        Charlie temp=instance;
        if(temp==null)
        {
            synchronized (Charlie.class)
            {
                temp=instance;
                if(temp==null)
                {
                    instance=new Charlie();
                    temp=instance;
                }
            }
        }
        return temp;
    }
    /** -----------------------以下为各种调用函数------------------- **/

    public void addAccount(Double  gold)
    {

        account+=gold;

    }

    public boolean reduceAccount(Double gold)
    {
        if (account <gold) {
            return false;
        }
        account -= gold;
        return true;

    }


    public double getAccount()
    {
        return account;
    }

    public boolean solveStarvation(CharlieSolveStarvation charliesolvestarvation,Starvation starvation)
    {
        int food_required=starvation._required_food_amount;
        if(this.getAccount() > starvation._required_money_amount)
        {
            Area area= charliesolvestarvation.getArea();
            if(area != null)
            {
                account -= starvation._required_money_amount;
                DiningRoom diningroom=charliesolvestarvation.getArea().diningRoom;
                diningroom.addFoodAmount(starvation._required_food_amount);
                return true;
            }
        }
        System.out.println("There is not enough money");
        return false;
    }

}
