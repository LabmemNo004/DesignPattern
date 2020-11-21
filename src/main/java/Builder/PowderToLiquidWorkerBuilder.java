package Builder;
import FactoryParameter.Parameter;
import Worker.PowderToLiquidWorker;

public class PowderToLiquidWorkerBuilder {
    public PowderToLiquidWorkerBuilder() {
        System.out.println("成功创建液化巧克力工人的Builder");
    }
    public void createNewWorker(){
        _worker=new PowderToLiquidWorker();
    }
    public void setWorkType() {
        this._worker.setType("PowderToLiquid");
    }
    public void assignSpeed() { this._worker.setSpeed();}
}
