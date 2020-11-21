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

    public Worker removeWorker() {
        if(!workers.isEmpty()){
            Worker worker = workers.get(0);
            workers.remove(0);
            return worker;
        }
        return null;
    }

    public List<Worker> getWorkers(){
        return workers;
    }
}
