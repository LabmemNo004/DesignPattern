package Strategy1;

public class BigSquare implements ProduceBigChocolate{

    @Override
    public ChocolateShaping doShaping() {
        usingBigMould();
        return null;
    }

    @Override
    public void usingBigMould(){

        System.out.println("Shaping chocolate into big square shape");
    }
}