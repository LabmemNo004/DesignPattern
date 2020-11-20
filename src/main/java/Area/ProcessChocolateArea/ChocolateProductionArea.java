package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import Area.Area;

import Charlie.Charlie;
import Chocolate.Chocolate;
import Factory.Factory;
//差一个worker类

public class ChocolateProductionArea extends Area{
    private List<Worker> freeWorkers,busyWorkers;
    private SmashArea smashArea;
    private MeltArea meltArea;
    private FreezeArea freezeArea;

    //构造函数
    ChocolateProductionArea(Charlie charlie, Factory factory){// 留言：更新了super和参数
        super("1","ProductionArea",charlie,factory);
        freeWorkers = new ArrayList<Worker>();
        busyWorkers = new ArrayList<Worker>();
        smashArea = new SmashArea();
        meltArea = new MeltArea();
        freezeArea = new FreezeArea();
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
        if(freeWorkers.size==0){
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

    //从总生产区分配工人到某个区域，参数只能传入本类的三个区域，使用get函数获取
    public <T extends ChocolateProductionArea> void addAreaWorker(T area) {
        // if(area instanceof ChocolateProductionArea)return;
        Worker worker = workerFreeToBusy();
        if(worker!=null)area.getWorkers().add(worker);
    }

    //从某个区域收回工人到总生产区，参数只能传入本类的三个区域，使用get函数获取
    public <T extends ChocolateProductionArea> boolean removeAreaWorker(T area) {
        // if(area instanceof ChocolateProductionArea)return false;
        List<Worker> w = area.getWorkers();
        if(w.empty()){
            System.out.println("当前区域没有工人");
            return false;
        }
        Worker worker = w.get(0);
        worker.remove(0);
        return workerBusyToFree(worker);
    }
}
