package Decorator;

import Chocolate.IChocolate;
import FactoryParameter.Parameter;

import java.io.Serializable;

public class LqChocolateDecorator extends ChocolateDecorator implements Serializable {
    public LqChocolateDecorator(IChocolate obj){
        super(obj);
    }

    @Override
    public double getPrice(){return obj.getPrice()*(1- Parameter.quality);};
    //获得巧克力基础定价
}
