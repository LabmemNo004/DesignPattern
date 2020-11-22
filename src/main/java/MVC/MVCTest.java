package MVC;

import Chocolate.Chocolate;
import Color.*;
import Mould.*;
import Shaped.*;

/*MVC + Strategy + Bridge 模式测试*/
public class MVCTest {
    public static void main(String[]args){
        Chocolate chocolate=new Chocolate();
        Mould mould=new SmallMould(new StarShaped(),new WhiteColor());
        chocolate.setProduceStrategy(mould);
        chocolate.Produce();
        ChocolateView view=new ChocolateView();
        ChocolateController controller=new ChocolateController(chocolate,view);
        controller.updateView();
        controller.setChocolateComment("delicious and exquisite");
        controller.setChocolateNickname("LightStar");
        controller.setChocolatePrice(18.0);
        controller.updateView();
    }
}
