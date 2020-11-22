package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import Chocolate.Chocolate;
import Worker.PowderToLiquidWorker;
import Worker.Worker;

public class MeltArea extends WorkerProduceLink{
    public List<Chocolate> melt(Queue<Chocolate> powder){
        List<Chocolate> chocolates = new ArrayList<>();
        for(Worker w:getWorkers()){
            PowderToLiquidWorker worker = (PowderToLiquidWorker)w;
            Chocolate chocolate = powder.poll();//获取下一个巧克力
            if(chocolate==null)break;//可能出现人多巧克力少的情况
            meltChocolate(worker, chocolates, chocolate);
            if(worker.GetExtensionWorker(worker.getWorkTypeString())!=null){
                Chocolate _chocolate = powder.poll();//获取下一个巧克力
                if(_chocolate==null)break;//可能出现人多巧克力少的情况
                meltChocolate(worker, chocolates, _chocolate);
            }
            
        }
        return chocolates;
    }

    private void meltChocolate(PowderToLiquidWorker worker,List<Chocolate> chocolates,Chocolate chocolate) {
        worker.work(chocolate);//生产工人将巧克力从粉末变成液体
        System.out.println("融化了一份巧克力");
        chocolates.add(chocolate);
    }
}
