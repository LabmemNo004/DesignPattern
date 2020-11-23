import org.junit.Test;

import java.util.Iterator;
import Visitor.StsChocolateVisitor;
import Factory.Factory;
import Chocolate.IChocolate;
import java.util.ArrayList;

public class VisitorTest {
    @Test
    public void test(){
        StsChocolateVisitor stsChocolateVisitor=new StsChocolateVisitor();
        Factory factory=Factory.getInstance();
        ArrayList<IChocolate> chocolatesList=factory.getChocolates();
        for (IChocolate ichocolate : chocolatesList) {
            ichocolate.accept(stsChocolateVisitor);
        }
    }

}
