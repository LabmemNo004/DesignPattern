package Converter;

import Chocolate.Chocolate;
import Prototype.MouldCahce;
import Chocolate.Mould;

/**
 * @author : SCH001
 * @description :
 */
public class ChocolateConverter extends Converter<SimiFinishedChocolate, Chocolate> {

    public ChocolateConverter(){
        super(simiFinishedChocolate->{
            Chocolate chocolate = new Chocolate();
            MouldCahce.loadCache();
            Mould clonedShape1 = (Mould) MouldCahce.getShape("bigStarWhite");
            System.out.println("======使用 Prototype原型======");
            System.out.println("Size: "+clonedShape1.getSize()+"   Shape: " + clonedShape1.getShape()+"   Color: "+clonedShape1.getColor());
            chocolate.Produce(clonedShape1);
            SimiFinishedChocolate.simiToChoco(chocolate,simiFinishedChocolate);
            return chocolate;
        }, SimiFinishedChocolate::getMemento);
        System.out.println("你初始化了一个ChocolateConverter（转换器 Converter模式）");
    }

    public static void main(){
        System.out.println("======== 使用 转换器 Converter模式 =======");
        Chocolate chocolate = new Chocolate();
        SimiFinishedChocolate simiFinishedChocolate = SimiFinishedChocolate.getMemento(chocolate);

        ChocolateConverter converter = new ChocolateConverter();
        assert converter.convertFromDto(simiFinishedChocolate).equals(chocolate);
    }
}
