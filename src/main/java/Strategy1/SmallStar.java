package Strategy1;

public class SmallStar implements ProduceSmallChocolate{

    @Override
    public ChocolateShaping doShaping(){

        usingSmallMould();
        return null;
    }

    @Override
    public void usingSmallMould(){

        System.out.println("Shaping chocolate into small star shape");
    }
}