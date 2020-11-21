import AbstractFactory.AbstractChocolateFactory;
import AbstractFactory.BigChocolateFactory;
import Mould.Mould;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlyweightTest {
    @Test
    public void test() {

        System.out.println("测试Flyweight模式：");
        System.out.println("提示：Flyweight模式在抽象工厂模式中实现，所以测试过程会涉及抽象工厂模式，以及抽象工厂内的享元模式和桥接模式。");
        System.out.println("");

        AbstractChocolateFactory BigChocolateFactory = new BigChocolateFactory();
        Mould firstBigBlackHeartMould = BigChocolateFactory.createBlackHeartMould();
        int hashCode_1 = firstBigBlackHeartMould.hashCode();
        System.out.println("Hash code of the first object of Mould is: " + hashCode_1);
        Mould secondBigBlackHeartMould = BigChocolateFactory.createBlackHeartMould();
        int hashCode_2 = firstBigBlackHeartMould.hashCode();
        System.out.println("Hash code of the second object of Mould is: " + hashCode_2);

        assertEquals(hashCode_1, hashCode_2);
        System.out.println("先后获取的两个实例对象的hashCode一样，说明共享同一份内存空间，测试成功！");

    }
}
