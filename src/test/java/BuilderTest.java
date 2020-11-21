import org.junit.Test;
import Worker.Worker;//待完成
import Builder.*;

public class BuilderTest {
    @Test
    public void main(){
        System.out.println("测试Builder模式：");
        System.out.println("提示：根据调用关系，在Builder模式内创建工人时会用到私有类数据模式，为工人分配速度用到享元模式。");
        System.out.println("");

        BuilderUse director = new BuilderUse();

        // 使用Builder先后创建二种工种的工人
        WorkerBuilder powderToLiquidWorkerBuilder = new PowderToLiquidWorkerBuilder();
        director.setBuilder( powderToLiquidWorkerBuilder );
        director.constructWorkerer();
        Worker worker1 = director.getWorker();
        System.out.println( director.toStringZh() );
        System.out.println("");

        FarmerBuilder liquidToSolidWorkerBuilder = new LiquidToSolidWorkerBuilder();
        director.setBuilder( liquidToSolidWorkerBuilder );
        director.constructWorkerer();
        Worker worker2 = director.getWorker();
        System.out.println( director.toStringZh() );
        System.out.println("");
    }

}