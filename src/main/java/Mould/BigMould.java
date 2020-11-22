package Mould;

import Color.Color;
import Shaped.MouldShape;

/*模具型号：大型*/
public class BigMould extends Mould{
    @Override
    public Size getSize() {
        return Size.big;
    }

    @Override
    public void getInfo() {

        System.out.println("型号:"+getSize());
        System.out.println("形状:"+shape.getShape());
        System.out.println("颜色:"+color.getColor());


    }

    public BigMould(MouldShape s, Color c){
        super(s,c);
        System.out.println("成功创建模具!该模具可以制作，");
        getInfo();
        System.out.println("的巧克力!");
    }
}
