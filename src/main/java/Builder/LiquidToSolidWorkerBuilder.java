package Builder;

import FactoryParameter.Parameter;
import Worker.Attribute;
import Worker.AttributeCreate;
import Worker.LiquidToSolidWorker;

public class LiquidToSolidWorkerBuilder extends WorkerBuilder{
    private Attribute attribute;
    
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
    @Override
    public void createNewWorker() {
        // _worker=new Worker(attribute);
        attribute= new AttributeCreate().randomAttribute();
        _worker=new LiquidToSolidWorker(attribute,"LiquidToSolid");
        Parameter.WorkersBusinessObject.addWorker(_worker);
    }

}
