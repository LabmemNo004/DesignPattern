package ObjectPool;

import Worker.*;
import FactoryParameter.*;
import java.util.HashMap;

public class WorkerPool{
    // 容器， 容纳对象
    private HashMap<Worker, WorkerStatus> pool = new HashMap<Worker, WorkerStatus>();

    // 初始化时创建对象， 并放入到池中
    public WorkerPool() {
        System.out.println("======== 使用对象池 Object Pool 模式 ========");
        pool.put(create(), new WorkerStatus());
    }

    // 从Hashtable中取出空闲元素
    public synchronized Worker checkOut() {
        System.out.println("从工人池中取出空闲对象");
        for (Worker worker : pool.keySet()) {
            if (pool.get(worker).validate()) {
                pool.get(worker).setUsing();
                return worker;
            }
        }
        return null;
    }

    // 归还对象public
    public synchronized void checkIn(Worker worker) {
        System.out.println("归还空闲对象到工人池中");
        if(pool.get(worker)==null) {
            pool.put(worker, new WorkerStatus());

        }
        pool.get(worker).setFree();
        Attribute attribute=new Attribute("","","",0);
        worker.setAttribute(attribute);
        worker.setWorkSpeed(1);
        //pool.get(worker).poolFree=true;
    }

    class WorkerStatus {
        protected boolean poolFree=true;
        public void WorkerStatus(){
            poolFree=true;
        }
        public void setUsing() {
            poolFree=false;
        }

        // 释放
        public void setFree() {
            // 注意： 若有状态， 则需要回归到初始化状态
            poolFree=true;

        }

        // 检查是否可用
        public boolean validate() {
            return poolFree;
        }
    }

    // 创建池化对象
    public Worker create(){
        Attribute attribute=new Attribute("","","",0);
        Worker workerCreated=new Worker(attribute);
        pool.put(workerCreated, new WorkerStatus());
        return workerCreated;
    };
}