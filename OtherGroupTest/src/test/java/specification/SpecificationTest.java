package specification;

import org.junit.Test;
import static specification.SelectorTestDemo.boxingSelector;

/*
 * @Tester transparency
 * @Date 20:10 2020/12/1
*/ 
public class SpecificationTest {
    @Test
    public void SpecificationTest() {
        System.out.println("================ TEST Specification ================");
        final Turtle turtle = new Turtle();
        final Slime slime = new Slime();
        final Troll troll = new Troll();
        final Panda panda = new Panda();
        boxingSelector(turtle);
        boxingSelector(slime);
        boxingSelector(troll);
        boxingSelector(panda);
        System.out.println("========================TEST END ========================");
    }
}
