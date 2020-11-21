import org.junit.Test;
import Person.Worker;//待完成
import Builder.*;

public class BuilderTest {
    @Test
    public void main(){
        System.out.println("测试Builder模式：");
        System.out.println("提示：根据调用关系，在Builder模式内创建工人时会用到私有类数据模式，为工人分配速度用到享元模式。");
        System.out.println("");

        BuilderUse director = new BuilderUse();

        // 使用Builder先后创建三种工种的工人
        WorkerBuilder materialWorkerBuilder = new MaterialWorkerBuilder();
        director.setBuilder( materialWorkerBuilder );
        director.constructWorkerer();
        Worker worker1 = director.getWorker();
        System.out.println( director.toStringZh() );
        System.out.println("");

        FarmerBuilder packagingWorkerBuilder = new PackagingWorkerBuilder();
        director.setBuilder( cultivateFarmerBuilder );
        director.constructFarmer();
        Worker worker2 = director.getWorker();
        System.out.println( director.toStringZh() );
        System.out.println("");

        FarmerBuilder productionWorkerBuilder = new ProductionWorkerBuilder();
        director.setBuilder( feedWorkerBuilder );
        director.constructWorker();
        Worker worker3 = director.getWorker();
        System.out.println( director.toStringZh() );
    }

}
