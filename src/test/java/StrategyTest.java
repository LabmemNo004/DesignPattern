import org.junit.Test;
import Strategy.*;
import Chocolate.Chocolate;
import Color.*;
import Mould.*;
import Shaped.*;
/*Strategy + Bridge 模式测试*/
public class StrategyTest {
    @Test
    public void main(){
        Chocolate chocolate1=new Chocolate();
        Chocolate chocolate2=new Chocolate();
        Chocolate chocolate3=new Chocolate();
        Mould mould1=new SmallMould(new StarShaped(),new WhiteColor());
        Mould mould2=new MiddleMould(new HeartShaped(),new WhiteColor());
        Mould mould3=new BigMould(new SquareShaped(),new BlackColor());
        chocolate1.setProduceStrategy(mould1);
        chocolate1.Produce();
        chocolate2.setProduceStrategy(mould2);
        chocolate2.Produce();
        chocolate3.setProduceStrategy(mould3);
        chocolate3.Produce();
    }

}
