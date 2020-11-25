import org.junit.Test;
import  Servant.*;
import Worker.*;
import Chocolate.*;
import Mould.*;
import FactoryParameter.*;
import Color.*;
import Shaped.*;

import java.util.ArrayList;

public class ServantTest {
    @Test
    public void test(){
        System.out.println("测试Servant模式：");
        System.out.println("");
        Attribute attribute1=new Attribute("0001","20000410","F",50000);
        Attribute attribute2=new Attribute("0002","20000820","M",10000);
        LiquidToSolidWorker _LTSworker=new LiquidToSolidWorker(attribute1,"LiquidToSolid");
        PowderToLiquidWorker _PTLworker=new PowderToLiquidWorker(attribute2,"PowderToLiquid");
        Chocolate _chocolate=new Chocolate();
        BlackColor b_c=new BlackColor();
        HeartShaped h_s=new HeartShaped();
        BigMould _mould=new BigMould(h_s,b_c);
        Servant _servant=new Servant();
        Serviced _serviced=new Serviced();
        System.out.println("使用Servant模式分配工人完成粉转液工作，将粉状黑巧克力原料转换成液态大号心形黑巧克力");
        Chocolate chocolate1=_servant.service(_serviced,_PTLworker,_chocolate,_mould);
        System.out.println("使用Servant模式分配工人完成液转固工作，将液态黑巧克力半成品转换成固态大号心形黑巧克力");
        Chocolate chocolate2=_servant.service(_serviced,_LTSworker,chocolate1,_mould);
    }
}
