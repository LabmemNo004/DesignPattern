import AbstractFactory.*;
import org.junit.Test;
public class IteratorTest {
    @Test
    public void main(){
        BigChocolateFactory bigMouldFactory=new BigChocolateFactory();
        bigMouldFactory.createAllMould();
        bigMouldFactory.useIterator();
    }
}
