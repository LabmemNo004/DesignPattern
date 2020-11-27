package FrontController;
import Chocolate.*;
import Mould.*;
import Strategy.*;

import java.io.Serializable;

public class ProduceView implements Serializable {
    private ProduceChocolate produceStrategy;
    public Chocolate chocolate;
    public void produceChocolateView(Mould m){
        switch (m.getSize().toString()){
            case "big":
                produceStrategy=new ProduceBigChocolate((BigMould)m);
                produceStrategy.doShape(chocolate);
                break;//留言：加break退出switch
            case "middle":
                produceStrategy=new ProduceMiddleChocolate((MiddleMould)m);
                produceStrategy.doShape(chocolate);
                break;
            case "small":
                produceStrategy=new ProduceSmallChocolate((SmallMould)m);
                produceStrategy.doShape(chocolate);
                break;
        }
    }
}
