import org.junit.Test;
import AbstractFactory.*;
/*Abstract Factory + Flyweight + Iterator + Bridge
 * 测试类*/
public class AbstractFactoryTest {
    @Test
    public void main(){
        BigChocolateFactory bigMouldFactory=new BigChocolateFactory();
        MiddleChocolateFactory middleMouldFactory=new MiddleChocolateFactory();
        SmallChocolateFactory smallMouldFactory=new SmallChocolateFactory();
        bigMouldFactory.createBlackHeartMould();
        bigMouldFactory.createBlackSphericalMould();
        bigMouldFactory.createWhiteSquareMould();
        bigMouldFactory.createWhiteHeartMould();
        middleMouldFactory.createBlackSphericalMould();
        middleMouldFactory.createWhiteSphericalMould();
        middleMouldFactory.createWhiteSquareMould();
        smallMouldFactory.createBlackSquareMould();
        smallMouldFactory.createBlackStarMould();
        smallMouldFactory.createWhiteHeartMould();
        smallMouldFactory.createWhiteSphericalMould();
        smallMouldFactory.createWhiteStarMould();
        bigMouldFactory.useIterator();
        middleMouldFactory.useIterator();
        smallMouldFactory.useIterator();
    }
}
