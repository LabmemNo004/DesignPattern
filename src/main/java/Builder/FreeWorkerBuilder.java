package Builder;
import FactoryParameter.Parameter;
import Worker.*;

public abstract class FreeWorkerBuilder extends WorkerBuilder{

    private Attribute attribute=new Attribute("","","",0);

    public FreeWorkerBuilder(){

        System.out.println("成功创建空闲型工人Builder");
  }
  public void setWorkType(){
    this._worker.setType(Parameter.WorkType.SPARE);
  }


  public void assignSpeed(){
        this._worker.setWorkSpeed(0);
  }

  @Override
  public void createNewWorker() {
    
  }
}
