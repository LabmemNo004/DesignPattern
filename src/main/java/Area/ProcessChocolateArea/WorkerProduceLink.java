package Area.ProcessChocolateArea;

import Worker.Worker;

import java.util.ArrayList;
import java.util.List;


//描述由工人进行生产的生产环节，子类有MeltArea和FreezeArea
public abstract class WorkerProduceLink {
    private List<Worker> workers;

    public WorkerProduceLink(){
        workers = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void removeWorker(Worker worker) {
        if(workers.contains(worker)){
            workers.remove(worker);
        }
        else System.out.println("该生产环节中不存在该工人");
    }

    public List<Worker> getWorkers(){
        return workers;
    }
}
