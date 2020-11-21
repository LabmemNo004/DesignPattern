package Strategy;

import Mould.*;
import Chocolate.Chocolate;


public class ProduceBigChocolate implements ProduceChocolate{
    private BigMould bigMould;


    public ProduceBigChocolate(BigMould m){
        System.out.println("======== 使用策略 Strategy 模式 ========");
        bigMould=m;
    }
    @Override
    public void doShape(Chocolate chocolate) {
        useBigMould();
        chocolate.setSSC(bigMould);//用模具塑形

    }
    public void useBigMould(){
        System.out.println("使用大型模具为巧克力塑形...");

    }
}
