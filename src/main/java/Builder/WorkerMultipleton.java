package Builder;

import Worker.Worker;
import FactoryParameter.*;
import java.io.Serializable;
import java.util.ArrayList;

public class WorkerMultipleton implements Serializable {
    private static final int TYPE_NUM=Parameter.WorkType.values().length;
    private String name;
    private boolean if_hired=false;
    public Worker worker;
    private static ArrayList<WorkerMultipleton> list=new ArrayList<>(Parameter.EACH_TYPE_NUM * TYPE_NUM);
    private int _age;


private WorkerMultipleton(String name, Director director){
    this.name=name;
    worker=director.getWorker();
}

static {
    ArrayList<WorkerBuilder> workerBuilders=new ArrayList<>();
    workerBuilders.add(new FreeWorkerBuilder() {
    });
    workerBuilders.add(new LiquidToSolidWorkerBuilder());
    workerBuilders.add(new PowderToLiquidWorkerBuilder());
    Director director= new Director();
    for(int i=0;i<8;i++){
        director.setBuilder(workerBuilders.get(i));
        director.constructWorker();;
        director.toStringZh();
        for (int j=0;j<4;j++){
            list.add(new WorkerMultipleton(Parameter.WORKER_NAMES.get(i * Parameter.EACH_TYPE_NUM + j), director));
        }
    }
}

public static WorkerMultipleton getRandomInstance(){
    System.out.println("========== 使用多例 Multipleton 模式 ===========");
    for (int i = 0;i<Parameter.EACH_TYPE_NUM * TYPE_NUM;i++){
        if (!list.get(i).if_hired){
            break;
        }
        if (i == Parameter.EACH_TYPE_NUM * TYPE_NUM -1){
            System.out.println("工人数量已达上限");
            return null;
        }
    }
    int num = (int) (Math.random() * (Parameter.EACH_TYPE_NUM * TYPE_NUM));
    while (list.get(num).if_hired) {
        num = (int) (Math.random() * (Parameter.EACH_TYPE_NUM * TYPE_NUM));
    }
    list.get(num).if_hired = true;
    System.out.println("获取到" + list.get(num).worker.getWorkType() + "类工人:"+list.get(num).getName());
    return list.get(num);
}

    public static WorkerMultipleton getLTSInstance(){
        System.out.println("========== 使用多例 Multipleton 模式 ===========");
        WorkerMultipleton result = null;
        for(int i = 0;i < Parameter.EACH_TYPE_NUM * TYPE_NUM;i++){
            if ((!list.get(i).if_hired) && list.get(i).worker.getWorkType().equals(Parameter.WorkType.LTS)) {
                result = list.get(i);
                result.if_hired = true;
                break;
            }
        }
        if (result == null){
            System.out.println("液转固种类工人数量已达上限");
        }
        else{
            System.out.println("获取到液转固类农民:"+result.getName());
        }
        return result;
    }

    public static WorkerMultipleton getPTLInstance(){
        System.out.println("========== 使用多例 Multipleton 模式 ===========");
        WorkerMultipleton result = null;
        for(int i = 0;i < Parameter.EACH_TYPE_NUM * TYPE_NUM;i++){
            if ((!list.get(i).if_hired) && list.get(i).worker.getWorkType().equals(Parameter.WorkType.PTL)) {
                result = list.get(i);
                result.if_hired = true;
                break;
            }
        }
        if (result == null){
            System.out.println("粉转液种类工人数量已达上限");
        }
        else{
            System.out.println("获取到粉转液类农民:"+result.getName());
        }
        return result;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){return _age;}

    public void setAge(int age){
        this._age = age;
    }
}