package Strategy1;

public class MiddleStar implements ProduceMiddleChocolate{

    @Override
    public ChocolateShaping doShaping(){

        usingMiddleMould();
        return null;
    }

    @Override
    public void usingMiddleMould(){

        System.out.println("Shaping chocolate into middle star shape");
    }
}