package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;

public class SmashArea extends ChocolateProductionArea{
    private List<Worker> workers;

    SmashArea(){
        workers = new ArrayList<>();
    }

    public List<Chocolate> smash() {
		List<Chocolate> chocolates = new ArrayList<>();
		for(Worker worker:workers){//每个工人都工作，原料保证充足
			material.setNum(material.getNum()-1);//操作原料数量-1，如果原料不足调用观察者模式
			System.out.println(worker.getName()+"碾碎了原料,剩余原料"+material.getNum());//测试
			chocolates.add(new Chocolate());//新增巧克力
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
