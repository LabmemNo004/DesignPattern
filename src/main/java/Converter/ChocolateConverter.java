package Converter;

import Chocolate.Chocolate;


/**
 * @author : SCH001
 * @description :
 */
public class ChocolateConverter extends Converter<SimiFinishedChocolate, Chocolate> {

    public ChocolateConverter(){
        super(simiFinishedChocolate->{
            Chocolate chocolate = new Chocolate();
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
