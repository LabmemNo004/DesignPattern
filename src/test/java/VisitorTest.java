import org.junit.Test;

import java.util.Iterator;
import Visitor.StsChocolateVisitor;
import Factory.Factory;
import Chocolate.IChocolate;

public class VisitorTest {
    @Test
    public void test(){
        StsChocolateVisitor stsChocolateVisitor=new StsChocolateVisitor();
        Factory factory=Factory.getInstance();
        ArrayList<IChocolate> chocolatesList=factory.getChocolates();
        for(Iterator<IChocolate>it=chocolateList.iterator();it.hasNext(); ){
            IChocolate chocolate=it.next();
            chocolate.accept(stsChocolateVisitor);
        }
    }

}
