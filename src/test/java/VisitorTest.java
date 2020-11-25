import org.junit.Test;

import java.util.Iterator;
import Visitor.StsChocolateVisitor;
import Factory.Factory;
import Chocolate.IChocolate;
import java.util.ArrayList;

public class VisitorTest {
    @Test
    public void test(){
        System.out.println("测试Visitor模式：");

        System.out.println("");
        StsChocolateVisitor stsChocolateVisitor=new StsChocolateVisitor();
        Factory factory=Factory.getInstance();
        ArrayList<IChocolate> chocolatesList=factory.getChocolates();
        for (IChocolate ichocolate : chocolatesList) {
            ichocolate.accept(stsChocolateVisitor);
        }
    }

}
