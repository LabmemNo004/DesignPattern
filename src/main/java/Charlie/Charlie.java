package Charlie;

import FactoryParameter.FactoryParameter;
import Observer.MaterialObserver;
import Chocolate.Material;
import Chocolate.Color.Colors;

public class Charlie implements MaterialObserver{
    private double account;
    private Charlie()
    {

    }

    public void addAccount(Double  gold)
    {
        account+=gold;
    }

    public void reduceAccount(Double  gold)
    {
        account-=gold;
    }

    public double getAccout()
    {
        return account;
    }

    //以下为观察者模式
   @Override
   public void update(Material material, Colors color) {
        int num=0;
        double cost = 0;
        if(color==Colors.black){
            num = (int)(account/2/FactoryParameter.blackMeterialPrice);
            cost = num*FactoryParameter.blackMeterialPrice;
        }
        else {
            num = (int)(account/2/FactoryParameter.whiteMeterialPrice);
            cost = num*FactoryParameter.whiteMeterialPrice;
        }
        reduceAccount(cost);
        material.add(num);
        System.out.println("charlie花费"+cost+"购买了"+num+"份原料");
   }

    static public Charlie charlie=new Charlie();
}
