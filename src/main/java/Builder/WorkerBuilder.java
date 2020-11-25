package Builder;

import Worker.*;

import FactoryParameter.Parameter;




public abstract class WorkerBuilder {
    protected Worker _worker;
    private Attribute attribute=new Attribute("","","",0);

    public WorkerBuilder()  {System.out.println("======== 使用建造者 Builder 模式 ========");}



    public Worker getWorker()   {return _worker;}


    public void createNewWorker(){

        _worker=new Worker(attribute);
        Attribute attribute= new AttributeCreate().randomAttribute();
        _worker=new Worker(attribute);
        Parameter.WorkersBusinessObject.addWorker(_worker);

    }


    public abstract void setWorkType();

    public abstract void assignSpeed();
}
