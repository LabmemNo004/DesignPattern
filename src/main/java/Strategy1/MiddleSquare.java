package Strategy1;

public class MiddleSquare implements ProduceMiddleChocolate{

    @Override
    public ChocolateShaping doShaping(){

        usingMiddleMould();
        return null;
    }

    @Override
    public void usingMiddleMould(){

        System.out.println("Shaping chocolate into middle square shape");
    }
}