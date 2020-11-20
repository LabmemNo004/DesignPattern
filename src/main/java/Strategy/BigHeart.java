package Strategy;

public class BigHeart implements ProduceBigChocolate{

    @Override
    public ChocolateShaping doShaping() {

        usingBigMould();
        return null;
    }

    @Override
    public void usingBigMould(){

        System.out.println("Shaping chocolate into big heart shape");
    }
}
