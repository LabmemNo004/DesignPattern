package Strategy;

import Chocolate.Chocolate;
import Color.WhiteColor;
import Mould.*;
import Shaped.StarShaped;
/*Strategy + Bridge 模式测试*/
public class StrategyTest {
    public static void main(String[]args){
        Chocolate chocolate1=new Chocolate();
        Mould mould=new SmallMould(new StarShaped(),new WhiteColor());
        chocolate1.setProduceStrategy(mould);
        chocolate1.Produce();
    }
}
