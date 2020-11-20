package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import Chocolate.Mould;
import Chocolate.Color.Colors;
import Chocolate.Chocolate;
import Area.RawMaterialManagementArea;

public class FreezeArea extends WorkerProduceLink{
    private List<Mould> moulds;//模具

    FreezeArea(){
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
    public List<Chocolate> freeze(Queue<Chocolate> liquid) {
        List<Chocolate> chocolates = new ArrayList<>();
        for(Worker worker:getWorkers()){
            if(moulds.size()==0)break;//没有模具
            Chocolate chocolate = liquid.poll();//获取液体巧克力
            if(chocolate==null)break;
            int mouldIdx = (int)Math.random()*100%moulds.size();//随机获取模具列表的索引
            Mould mould = moulds.get(mouldIdx);//获取对应模具
            // chocolate.produce(mould);//赋值
            worker.liquidToSolid(chocolate,mould);//生产工人将巧克力从液体变为固体
            //减少原料
            if(mould.getColor()==Colors.black)RawMaterialManagementArea.blackProduce();
            else RawMaterialManagementArea.whiteProduce();
            System.out.println(worker.getName()+"生产了一份巧克力");
            chocolates.add(chocolate);
        }
        return chocolates;
    }
}
