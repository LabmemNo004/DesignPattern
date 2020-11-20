package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import Chocolate.Chocolate;

public class MeltArea extends WorkerProduceLink{
    public List<Chocolate> melt(Queue<Chocolate> powder){
        List<Chocolate> chocolates = new ArrayList<>();
        for(Worker worker:getWorkers()){
            Chocolate chocolate = powder.poll();//获取下一个巧克力
            if(chocolate==null)break;//可能出现人多巧克力少的情况
            if(worker instanceof concreteWorker)//出现强化工人的情况
            worker.powderToLiquid(chocolate);//生产工人将巧克力从粉末变成液体
            System.out.println(worker.getName()+"融化了一份巧克力");
            chocolates.add(chocolate);
        }
        return chocolates;
    }
}
