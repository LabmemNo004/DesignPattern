package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import Chocolate.Chocolate;
import Worker.PowderToLiquidWorker;
import Worker.Worker;
import Chocolate.IChocolate;
import Worker.LiquidToSolidWorker;
import Worker.Adapter;
import Worker.Extension;
import Worker.ConcreteExtension;

public class MeltArea extends WorkerProduceLink{
    public List<IChocolate> melt(Queue<IChocolate> powder){
        List<IChocolate> chocolates = new ArrayList<>();
        OUTER:
        for(Object w:getWorkers()){
            if(w.getClass()==LiquidToSolidWorker.class)
            {
                w= new Adapter((LiquidToSolidWorker)w);
            }
            if(w instanceof Worker){//普通工人
                PowderToLiquidWorker worker = (PowderToLiquidWorker)w;
                IChocolate chocolate = powder.poll();//获取下一个巧克力
                if(chocolate==null)break;//可能出现人多巧克力少的情况
                meltChocolate(worker, chocolates, chocolate);
            }
            else{//强化工人
                Extension extension = (ConcreteExtension)w;
                for (int i = 0; i < 2; i++) {
                    IChocolate chocolate = powder.poll();//获取下一个巧克力
                    if(chocolate==null)break OUTER;//可能出现人多巧克力少的情况
                    meltChocolate((PowderToLiquidWorker)extension.getOwner(), chocolates, chocolate);
                }
            }
        }
        return chocolates;
    }

    private void meltChocolate(PowderToLiquidWorker worker,List<IChocolate> chocolates,IChocolate chocolate) {
        worker.work((Chocolate)chocolate);//生产工人将巧克力从粉末变成液体
        System.out.println("融化了一份巧克力");
        chocolates.add((IChocolate)chocolate);
    }
}
