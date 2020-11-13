package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FreezeArea extends ChocolateProductionArea{
    private List<Worker> workers;
    private List<Mould> moulds;//模具

    FreezeArea(){
        workers = new ArrayList<>();
        moulds = new ArrayList<>();
    }

    //添加模具
    public void addMould(Mould mould) {
        moulds.add(mould);
    }

    //删除模具
    public boolean removeMould(Mould mould) {
        return moulds.remove(mould);
    }

    //获取模具列表
    public List<Mould> getMoulds(){
        return moulds;
    }

    //使用模具凝固
    public List<Chocolate> freeze(Queue<Chocolate> fluid) {
        List<Chocolate> chocolates = new ArrayList<>();
        for(Worker worker:workers){
            if(moulds.size()==0)break;//没有模具
            Chocolate chocolate = fluid.poll();//获取液体巧克力
            if(chocolate==null)break;
            //Chocolate _chocolate = worker.func(chocolate);   //
            int mouldIdx = (int)Math.random()*100%moulds.size();//随机获取模具列表的索引
            chocolate.produce(mould);//赋值
            chocolates.add(chocolate);
        }
        return chocolates;
    }

    // //往环节中添加工人
	// public void addWorker(Worker worker) {
	// 	workers.add(worker);
	// }

	// //从删除一个工人
	// public void removeWorker(){
	// 	Worker worker = workers.get(0);
	// 	workers.remove(worker);
	// }

    //获取工人列表
    public List<Worker> getWorkers() {
        return workers;
    }
}
