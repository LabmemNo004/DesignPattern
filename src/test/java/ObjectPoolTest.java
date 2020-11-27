import Chocolate.Chocolate;
import Color.*;
import FactoryParameter.Parameter;
import Mould.*;
import ObjectPool.WorkerPool;
import Shaped.HeartShaped;
import Shaped.SquareShaped;
import Worker.*;
import org.junit.Test;

public class ObjectPoolTest {
    @Test
    public void main(){
        WorkerPool _workerPool=new WorkerPool();
        Attribute a1=new Attribute("0001","19990909","M",1000);
        System.out.println("创建一个新的粉转液类型的工人，开始工作：");
        PowderToLiquidWorker PTL_worker1=new PowderToLiquidWorker(a1,"PowderToLiquid");
        Chocolate _chocolate=new Chocolate();
        BlackColor b_c=new BlackColor();
        HeartShaped h_s=new HeartShaped();
        BigMould _mould=new BigMould(h_s,b_c);
        PTL_worker1.work(_chocolate,_mould);
        System.out.println("辛苦的工人勤勤恳恳工作数十年，达到了退休年龄，从工厂离职");
        _workerPool.checkIn(PTL_worker1);
        System.out.println("于是粉转液工作区招聘了一名新的工人继续工作");
        PowderToLiquidWorker PTL_worker2=(PowderToLiquidWorker)_workerPool.checkOut();
        Attribute a2=new Attribute("0002","20200101","F",1100);
        PTL_worker2.setAttribute(a2);
        PTL_worker2.setWorkSpeed(1);
        PTL_worker2.setType(Parameter.WorkType.PTL);
        Chocolate _chocolate2=new Chocolate();
        WhiteColor w_c2=new WhiteColor();
        SquareShaped s_s2=new SquareShaped();
        SmallMould _mould2=new SmallMould(s_s2,w_c2);
        PTL_worker2.work(_chocolate2,_mould2);
    }
}
