package Decorator;

import Chocolate.Chocolates;
import Factory.FactoryParameter;

import java.io.Serializable;

public class HqChocolateDecorator extends ChocolateDecorator implements Serializable {
    public HqChocolateDecorator(Chocolates obj){
        super(obj);
    }

    @Override
    public double getPrice(){return obj.getPrice()*(1+ FactoryParameter.quality);};
    //获得巧克力基础定价
}
