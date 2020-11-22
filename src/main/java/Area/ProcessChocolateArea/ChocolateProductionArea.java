package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import Area.Area;

import Charlie.Charlie;
import Factory.Factory;
import Worker.Worker;
//差一个worker类

public class ChocolateProductionArea extends Area{
    private List<Worker> freeWorkers,busyWorkers;
    private SmashArea smashArea;
    private MeltArea meltArea;
    private FreezeArea freezeArea;
    private volatile static ChocolateProductionArea ourInstance;

    //构造函数
    ChocolateProductionArea(Charlie charlie, Factory factory){// 留言：更新了super和参数
        super("2","ProductionArea",charlie,factory);
        freeWorkers = new ArrayList<Worker>();
        busyWorkers = new ArrayList<Worker>();
        smashArea = new SmashArea();
        meltArea = new MeltArea();
        freezeArea = new FreezeArea();
    }

    public static ChocolateProductionArea getInstance(Charlie charlie,Factory factory) {
        if (null == ourInstance) {
            synchronized (ChocolateProductionArea.class) {
                if (null == ourInstance) {
                    ourInstance = new ChocolateProductionArea(charlie,factory);
                    System.out.println("ChocolateProductionArea has been initialized!");
                }
            }
        }
        return ourInstance;
    }



    //添加空闲工人
    public void addFreeWorker(Worker worker) {
        freeWorkers.add(worker);
    }

    //删除空闲工人
    public boolean removeFreeWorker(Worker worker) {
        return freeWorkers.remove(worker);
    }

    //获取空闲工人列表
    public List<Worker> getFreeWorkers(){
        return freeWorkers;
    }

    //添加忙碌工人
    public void addBusyWorker(Worker worker) {
        busyWorkers.add(worker);
    }

    //删除忙碌工人
    public boolean removeBusyWorker(Worker worker) {
        return busyWorkers.remove(worker);
    }

    //获取忙碌工人列表
    public List<Worker> getBusyWorkers(){
        return busyWorkers;
    }

    //选择一个空闲工人置为忙碌
    private Worker workerFreeToBusy() {
        if(freeWorkers.size()==0){
            System.out.println("无空闲生产工人");
            return null;
        }
        Worker worker = freeWorkers.get(0);
        removeFreeWorker(worker);
        addBusyWorker(worker);
        return worker;
    }

    //将忙碌工人置为空闲
    private boolean workerBusyToFree(Worker worker){
        if(!busyWorkers.contains(worker)){
            System.out.println("不存在该工人");
            return false;
        }
        removeBusyWorker(worker);
        addFreeWorker(worker);
        return true;
    }

    //获取区域
    public SmashArea getSmashArea() {
        return smashArea;
    }

    public MeltArea getMeltArea() {
        return meltArea;
    }

    public FreezeArea getFreezeArea() {
        return freezeArea;
    }

    //从总生产区分配工人到某个区域，参数只能传入meltArea或freezeArea，使用get函数获取
    public <T extends WorkerProduceLink> void addAreaWorker(T area) {
        Worker worker = workerFreeToBusy();
        if(worker!=null)area.addWorker(worker);
    }

    //从某个区域收回工人到总生产区，参数只能传入meltArea或freezeArea，使用get函数获取
    public <T extends WorkerProduceLink> boolean removeAreaWorker(T area) {
        Worker worker = area.removeWorker();
        if(worker==null)return false;
        return workerBusyToFree(worker);
    }
}
