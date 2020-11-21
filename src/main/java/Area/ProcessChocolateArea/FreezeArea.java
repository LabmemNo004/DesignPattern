package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import Color.Color.Colors;
import Mould.Mould;
import Factory.Factory;
import Iterator.ObjectCollection;
import Chocolate.Chocolate;
import Area.RawMaterialManagementArea;
import Worker.LiquidToSolidWorker;
import Worker.Worker;
public class FreezeArea extends WorkerProduceLink{
    private RawMaterialManagementArea area = Factory.getInstance().getManageArea();
    //使用模具凝固
    public List<Chocolate> freeze(Queue<Chocolate> liquid) {
        List<Chocolate> chocolates = new ArrayList<>();
        for(Worker w:getWorkers()){
            LiquidToSolidWorker worker = (LiquidToSolidWorker)w;
            Chocolate chocolate = liquid.poll();//获取液体巧克力
            if(chocolate==null)break;
            freezeChocolate(worker, chocolates, liquid, chocolate);
            if(worker.GetExtensionWorker("LiquidToSolid")!=null){
                Chocolate _chocolate = liquid.poll();//获取液体巧克力
                if(_chocolate==null)break;
                freezeChocolate(worker, chocolates, liquid, _chocolate);
            }
        }
        return chocolates;
    }

    private boolean freezeChocolate(LiquidToSolidWorker worker,List<Chocolate> chocolates,Queue<Chocolate> liquid,Chocolate chocolate){
        int mouldIdx = (int)Math.random()*100%moulds.size();//随机获取模具列表的索引
            Mould mould = moulds.get(mouldIdx);//获取对应模具
            // chocolate.produce(mould);//赋值
            worker.work(chocolate,mould);//生产工人将巧克力从液体变为固体
            //减少原料
            if(mould.getColor()==Colors.black)area.blackProduce();
            else area.whiteProduce();
            System.out.println("生产了一份巧克力");
            chocolates.add(chocolate);
    }
}
