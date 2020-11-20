package Strategy;

public class SmallHeart implements ProduceSmallChocolate{

    @Override
    public ChocolateShaping doShaping(){
        usingSmallMould();
        return null;
    }

    @Override
    public void usingSmallMould(){

        System.out.println("Shaping chocolate into small heart shape");
    }
}
