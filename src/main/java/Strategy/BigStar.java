package Strategy;

public class BigStar implements ProduceBigChocolate{

    @Override
    public ChocolateShaping doShaping() {
        usingBigMould();
        return null;
    }

    @Override
    public void usingBigMould(){

        System.out.println("Shaping chocolate into big star shape");
    }
}