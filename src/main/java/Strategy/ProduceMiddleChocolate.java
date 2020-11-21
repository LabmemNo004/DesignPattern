package Strategy;

import Chocolate.Chocolate;
import Chocolate.MiddleMould;

public class ProduceMiddleChocolate implements ProduceChocolate{
    private MiddleMould middleMould;

    public ProduceMiddleChocolate(MiddleMould m){
        middleMould=m;
    }

    @Override
    public void doShape(Chocolate chocolate) {
        useMiddleMould();
        chocolate.setSSC(middleMould);//用模具塑形
    }

    public void useMiddleMould(){
        System.out.println("使用中型模具为巧克力塑形...");
    }
}
