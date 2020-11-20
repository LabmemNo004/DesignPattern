package Strategy;

public class MiddleHeart implements ProduceMiddleChocolate{

    @Override
    public ChocolateShaping doShaping(){
        usingMiddleMould();
        return null;
    }

    @Override
    public void usingMiddleMould(){

        System.out.println("Shaping chocolate into middle heart shape");
    }
}