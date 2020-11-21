package Chocolate;

import Color.BlackColor;
import Color.WhiteColor;
import Mould.BigMould;
import Mould.MiddleMould;
import Mould.Mould;
import Mould.SmallMould;
import Shaped.HeartShaped;
import Shaped.SphericalShaped;
import Shaped.SquareShaped;

public class Test {
    public static void main(String[]args){
        Mould mould1=new BigMould(new SphericalShaped(),new WhiteColor());
        Mould mould2=new MiddleMould(new SquareShaped(),new BlackColor());
        Mould mould3=new SmallMould(new HeartShaped(),new WhiteColor());
        Chocolate choco=new Chocolate();
        choco.Produce(mould1);
        System.out.println(choco.getName());
        System.out.println(choco.getQuality());
    }
}
