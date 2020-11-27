package Charlie;

import Area.Area;
import DiningRoom.DiningRoom;
import FactoryParameter.Parameter;
import Observer.MaterialObserver;
import Material.Material;
import Color.Color.Colors;
import SolveStarvation.CharlieSolveStarvation;
import SolveStarvation.Starvation;
import java.util.concurrent.*;

public class Charlie implements Robot{

    private double account=3000;
    private Charlie()
    {

    }
    
    public void addAccount(Double  gold)
    {

        System.out.println("========当前余额—— " + account + " 元========");

        account+=gold;
        System.out.println("========销售盈利 " + gold + " 元========");

        System.out.println("========当前余额—— " + account + " 元========");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public boolean reduceAccount(Double gold)
    {

        System.out.println("\n========当前余额—— " + account + " 元========");
        if (account <gold) {
            return false;
        }
        account -= gold;
        System.out.println("========购买原材料支出 " + gold + " 元========");
        System.out.println("========当前余额—— " + account + " 元========");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return true;

    }


    public double getAccount()
    {
        return account;
    }

    public boolean solveStarvation(CharlieSolveStarvation charliesolvestarvation, Starvation starvation)
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
        System.out.println("账户余额不足!");
        return false;
    }

    public void setAccount(double account)
    {
        this.account=account;
    }

    static public Charlie charlie=new Charlie();


}
