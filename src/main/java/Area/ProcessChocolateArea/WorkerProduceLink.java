package Area.ProcessChocolateArea;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


//描述由工人进行生产的生产环节，子类有MeltArea和FreezeArea
public abstract class WorkerProduceLink implements Serializable {
    private List<Object> workers;

    public WorkerProduceLink(){
        workers = new ArrayList<>();
    }

    public void addWorker(Object worker) {
        workers.add(worker);
    }

    public void removeWorker(Object worker) {
        if(workers.contains(worker)){
            workers.remove(worker);
        }
    }

    public List<Object> getWorkers(){
        return workers;
    }
}
