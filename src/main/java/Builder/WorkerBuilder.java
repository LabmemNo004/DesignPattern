package Builder;

import Worker.*;




public abstract class WorkerBuilder {
    protected Worker _worker;


    public WorkerBuilder()  {System.out.println("======== 使用建造者 Builder 模式 ========");}



    public Worker getWorker()   {return _worker;}


    public void createNewWorker(){
        Attribute attribute= new AttributeCreate().randomAttribute();
        _worker=new Worker(attribute);
    }


    public abstract void setWorkType();

    public abstract void assignSpeed();
}
