package SolveStarvation;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Starvation implements Serializable {
    public int _required_food_amount = 0;
    public int _required_money_amount = 0;

    /**
     * @return 解决饥饿所需要的食物
     */
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.0");
        if(_required_money_amount==0)
        {
            return "Lack of food amount:"+df.format(_required_food_amount) + ".";
        }
        else
        {
            return "Lack of food amount: " + df.format(_required_food_amount) + ". Need $"
                    + df.format(_required_money_amount)+" to buy additional food.";
        }
    }
}
