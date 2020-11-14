package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;

import Chocolate.Chocolate;

public class SmashArea extends ChocolateProductionArea{
    private List<Worker> workers;

    SmashArea(){
        workers = new ArrayList<>();
    }

    public List<Chocolate> smash() {
		List<Chocolate> chocolates = new ArrayList<>();
		for(Worker worker:workers){//每个工人都工作，原料保证充足
			System.out.println(worker.getName()+"制造了一份巧克力粉末");//测试
			chocolates.add(new Chocolate());//新增巧克力
		}
		return chocolates;
	}
}
