package Decorator;

import Chocolate.IChocolate;
import FactoryParameter.FactoryParameter;

import java.io.Serializable;

public class LqChocolateDecorator extends ChocolateDecorator implements Serializable {
    public LqChocolateDecorator(IChocolate obj){
        super(obj);
    }

    @Override
    public double getPrice(){return obj.getPrice()*(1- FactoryParameter.quality);};
    //获得巧克力基础定价
}
