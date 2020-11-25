package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import Area.Area;

import Worker.Charlie;
import Factory.Factory;
import Worker.PowderToLiquidWorker;
import Worker.*;



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

    /**
     * 使用扩展Extension模式
     * @param worker
     */
    public void addFreeWorker(Object worker)
    {
        if(worker instanceof Worker)
        {
            Worker workerr=(Worker)worker;
            freeWorkers.add(workerr);
        }
        if(worker instanceof Extension)
        {
            String str=((Extension) worker).getOwner().getWorkTypeString();
            Worker workerr1,workerr2;
            if(str=="LiquidToSolid")
            {
                int personid=freeWorkers.size()+busyWorkers.size()+1;
                workerr1=new LiquidToSolidWorker(new Attribute(personid+"","2020-01-01","man",2345.7),"LiquidToSolid");
                personid=personid+1;
                workerr2=new LiquidToSolidWorker(new Attribute(personid+"","2020-02-01","woman",2346.7),"LiquidToSolid");
                freeWorkers.add(workerr1);
                freeWorkers.add(workerr2);
            }
            if(str=="PowderToLiquid")
            {
                int personid=freeWorkers.size()+busyWorkers.size()+1;
                workerr1=new LiquidToSolidWorker(new Attribute(personid+"","2020-03-01","man",2345.7),"PowderToLiquid");
                personid=personid+1;
                workerr2=new LiquidToSolidWorker(new Attribute(personid+"","2020-04-01","woman",2346.7),"PowderToLiquid");
                freeWorkers.add(workerr1);
                freeWorkers.add(workerr2);
            }
        }
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
    /**
     * 使用扩展Extension模式
     * @param worker
     */
    public void addBusyWorker(Object worker) {
        if(worker instanceof Worker)
        {
            Worker workerr=(Worker)worker;
            busyWorkers.add(workerr);
        }
        if(worker instanceof Extension)
        {
            String str=((Extension) worker).getOwner().getWorkTypeString();
            Worker workerr1,workerr2;
            if(str=="LiquidToSolid")
            {
                int personid=freeWorkers.size()+busyWorkers.size()+1;
                workerr1=new LiquidToSolidWorker(new Attribute(personid+"","2020-01-01","man",2345.7),"LiquidToSolid");
                personid=personid+1;
                workerr2=new LiquidToSolidWorker(new Attribute(personid+"","2020-02-01","woman",2346.7),"LiquidToSolid");
                busyWorkers.add(workerr1);
                busyWorkers.add(workerr2);
            }
            if(str=="PowderToLiquid")
            {
                int personid=freeWorkers.size()+busyWorkers.size()+1;
                workerr1=new LiquidToSolidWorker(new Attribute(personid+"","2020-03-01","man",2345.7),"PowderToLiquid");
                personid=personid+1;
                workerr2=new LiquidToSolidWorker(new Attribute(personid+"","2020-04-01","woman",2346.7),"PowderToLiquid");
                busyWorkers.add(workerr1);
                busyWorkers.add(workerr2);
            }
        }
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
    private boolean workerFreeToBusy(Worker worker) {
        if(!freeWorkers.contains(worker)){
            System.out.println("生产区空闲工人列表不存在此工人");
            return false;
        }
        removeFreeWorker(worker);
        addBusyWorker(worker);
        return true;
    }

    //将忙碌工人置为空闲
    private boolean workerBusyToFree(Worker worker){
        if(!busyWorkers.contains(worker)){
            System.out.println("生产区忙碌工人列表不存在此工人");
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

    //从总生产区分配工人到某个区域
    public <T extends Worker> void addAreaWorker(Worker worker) {
        if(workerFreeToBusy(worker)){
            if(worker instanceof PowderToLiquidWorker)meltArea.addWorker(worker);
            else freezeArea.addWorker(worker);
        }
    }

    //从某个区域收回工人到总生产区
    public <T extends Worker> void removeAreaWorker(Worker worker) {
        if(workerBusyToFree(worker)){
            if(worker instanceof PowderToLiquidWorker)meltArea.removeWorker(worker);
            else freezeArea.removeWorker(worker);
        }

    }
}
