package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import Color.Color.Colors;
import Mould.Mould;
import Factory.Factory;
import Chocolate.Chocolate;
import Area.RawMaterialManagementArea;
import Worker.LiquidToSolidWorker;
import Worker.Worker;
public class FreezeArea extends WorkerProduceLink{
    //使用模具凝固
    public List<Chocolate> freeze(Queue<Chocolate> liquid) {
        List<Chocolate> chocolates = new ArrayList<>();
        RawMaterialManagementArea area = Factory.getInstance().getManageArea();
        for(Worker w:getWorkers()){
            LiquidToSolidWorker worker = (LiquidToSolidWorker)w;
            // if(moulds.size()==0)break;//没有模具
            Chocolate chocolate = liquid.poll();//获取液体巧克力
            if(chocolate==null)break;
            int mouldIdx = (int)Math.random()*100%moulds.size();//随机获取模具列表的索引
            Mould mould = moulds.get(mouldIdx);//获取对应模具
            // chocolate.produce(mould);//赋值
            worker.liquidToSolid(chocolate,mould);//生产工人将巧克力从液体变为固体
            //减少原料
            if(mould.getColor()==Colors.black)area.blackProduce();
            else area.whiteProduce();
            System.out.println(worker.getName()+"生产了一份巧克力");
            chocolates.add(chocolate);
        }
        return chocolates;
    }
}
