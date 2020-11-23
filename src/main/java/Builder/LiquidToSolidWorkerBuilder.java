package Builder;
import FactoryParameter.Parameter;
import Worker.LiquidToSolidWorker;

public class LiquidToSolidWorkerBuilder extends WorkerBuilder{
    public LiquidToSolidWorkerBuilder() {
        System.out.println("成功创建固化巧克力工人的Builder");
    }
    //public void createNewWorker(){
    //    _worker=new LiquidToSolidWorker();
    //}
    public void setWorkType() {
        this._worker.setType(Parameter.WorkType.LTS);//看worker里
    }
    public void assignSpeed() { this._worker.setWorkSpeed(1);}//worker里写函数，默认出事speed为1
}
