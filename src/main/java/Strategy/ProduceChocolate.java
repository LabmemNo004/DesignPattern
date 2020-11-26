package Strategy;

import Chocolate.Chocolate;

import java.io.Serializable;


public interface ProduceChocolate extends Serializable {
    void doShape(Chocolate chocolate);//生产巧克力
}
