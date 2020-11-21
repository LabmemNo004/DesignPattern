package Builder;

import Person.Worker;



public abstract class WorkerBuilder {
    protected Worker _worker;


    public WorkerBuilder()  {System.out.println("======== 使用建造者 Builder 模式 ========");}



    public Worker getWorker()   {return _worker;}


    public void createNewWorker(){_worker=new Worker();}


    public abstract void setWorkType();

    public abstract void assignSpeed();
}
