package Strategy;

import Chocolate.Chocolate;
import Mould.*;

public class ProduceSmallChocolate implements ProduceChocolate{
    SmallMould smallMould;
    public ProduceSmallChocolate(SmallMould m){
        System.out.println("======== 使用策略 Strategy 模式 ========");
        smallMould=m;
    }
    @Override
    public void doShape(Chocolate chocolate) {
        useSmallChocolate();
        chocolate.setSSC(smallMould);
    }
    public void useSmallChocolate(){
        System.out.println("使用小型模具为巧克力塑形...");
    }
}
