package Builder;
import FactoryParameter.Parameter;
import Worker.Attribute;
import Worker.AttributeCreate;
import Worker.PowderToLiquidWorker;

public class PowderToLiquidWorkerBuilder extends WorkerBuilder{
    private Attribute attribute;

    public PowderToLiquidWorkerBuilder() {
        System.out.println("成功创建液化巧克力工人的Builder");
    }
    //public void createNewWorker(){
    //    _worker=new PowderToLiquidWorker();
    //}
    public void setWorkType() {
        this._worker.setType(Parameter.WorkType.PTL); }
    public void assignSpeed() { this._worker.setWorkSpeed(1);}
    @Override
    public void createNewWorker() {
        attribute= new AttributeCreate().randomAttribute();
        // _worker=new Worker(attribute);
        _worker=new PowderToLiquidWorker(attribute,"PowderToLiquid");
        Parameter.WorkersBusinessObject.addWorker(_worker);
    }
}
