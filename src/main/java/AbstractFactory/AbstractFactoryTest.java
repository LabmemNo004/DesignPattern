package AbstractFactory;
/*Abstract Factory + Flyweight + Iterator
* 测试类*/

public class AbstractFactoryTest {
    public static void main(String[]args){
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
