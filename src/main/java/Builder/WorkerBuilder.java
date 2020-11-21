package Builder;

import Worker.Worker;



public abstract class WorkerBuilder {
    protected Worker _worker;


    public WorkerBuilder()  {System.out.println("======== 使用建造者 Builder 模式 ========");}



    public Worker getWorker()   {return _worker;}


    public abstract void createNewWorker();


    public abstract void setWorkType();

    public abstract void assignSpeed();
}
