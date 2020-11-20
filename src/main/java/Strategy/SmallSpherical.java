package Strategy;

public class SmallSpherical implements ProduceSmallChocolate{

    @Override
    public ChocolateShaping doShaping(){
        usingSmallMould();
        return null;
    }

    @Override
    public void usingSmallMould(){

        System.out.println("Shaping chocolate into small spherical shape");
    }
}