package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MeltArea extends ChocolateProductionArea{
    private List<Worker> workers;

    MeltArea(){
        workers = new ArrayList<>();
    }

    public List<Chocolate> melt(Queue<Chocolate> powder){
        List<Chocolate> chocolates = new ArrayList<>();
        for(Worker worker:workers){
            Chocolate chocolate = powder.poll();//获取下一个巧克力
            if(chocolate==null)break;//可能出现人多巧克力少的情况
            chocolates.add(chocolate);
        }
        return chocolates;
    }

    // //往环节中添加工人
	// public void addWorker(Worker worker) {
	// 	workers.add(worker);
	// }

	// //从环节中删除一个工人
	// public void removeWorker(){
	// 	Worker worker = workers.get(0);
	// 	workers.remove(worker);
    // }
    
    //获取工人列表
    public List<Worker> getWorkers() {
        return workers;
    }
}
