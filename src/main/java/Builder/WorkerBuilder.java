package Builder;

import Worker.*;
<<<<<<< HEAD
import FactoryParameter.Parameter;
=======

>>>>>>> 47631a2553e8dc3e367569150494d9b79507f41f



public abstract class WorkerBuilder {
    protected Worker _worker;
    private Attribute attribute=new Attribute("","","",0);

    public WorkerBuilder()  {System.out.println("======== 使用建造者 Builder 模式 ========");}



    public Worker getWorker()   {return _worker;}


    public void createNewWorker(){
<<<<<<< HEAD
        _worker=new Worker(attribute,Parameter.WorkType.SPARE);
=======
        Attribute attribute= new AttributeCreate().randomAttribute();
        _worker=new Worker(attribute);
>>>>>>> 47631a2553e8dc3e367569150494d9b79507f41f
    }


    public abstract void setWorkType();

    public abstract void assignSpeed();
}
