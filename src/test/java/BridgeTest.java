import org.junit.Test;
import Mould.*;
import Color.*;
import Shaped.*;
/*Bridge模式测试*/
public class BridgeTest {
    @Test
    public void main(){
        Mould mould1= new BigMould(new SphericalShaped(),new BlackColor());
        Mould mould2=new MiddleMould(new SquareShaped(),new WhiteColor());
        Mould mould3=new SmallMould(new StarShaped(),new BlackColor());
        System.out.println();
        System.out.println("模具mould1信息:");
        mould1.getInfo();
        System.out.println();
        System.out.println("模具mould2信息:");
        mould2.getInfo();
        System.out.println();
        System.out.println("模具mould3信息:");
        mould3.getInfo();
        System.out.println();
    }
}
