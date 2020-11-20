package Strategy;

public class MiddleSpherical implements ProduceMiddleChocolate{

    @Override
    public ChocolateShaping doShaping(){

        usingMiddleMould();
        return null;
    }

    @Override
    public void usingMiddleMould(){

        System.out.println("Shaping chocolate into middle spherical shape");
    }
}