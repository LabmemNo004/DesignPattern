package Builder;

import Person.Worker;

/**
 * The type Farmer builder.
 *
 * @className: WorkerBuilder
 * @author: Leon
 * @description:
 * @designPattern:
 * @date:
 */

public abstract class WorkerBuilder {
    protected Worker _worker;


    public WorkerBuilder()  {System.out.println("======== 使用建造者 Builder 模式 ========");}

    /**
     * Gets worker.
     * 获取当前 Builder 内的工人
     *
     * @return the worker
     */
    public Worker getWorker()   {return _worker;}

    /**
     * Create new worker.
     * 创建一个新的工人
     */
    public void createNewWorker(){_worker=new Worker();}

    /**
     * Sets work type.
     * 抽象方法：为工人设置工作类型
     */
    public abstract void setWorkType();
}
