package Area.ProcessChocolateArea;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Criteria.ChocolateCriteria;
import Chocolate.Chocolate;
import Chocolate.IChocolate;
import Factory.Factory;

//外观模式，封装生产这一系列操作
public class ProcessFacade {
    private SmashArea smashArea;
    private MeltArea meltArea;
    private FreezeArea freezeArea;
    private ChocolateCriteria criteria;
    private Queue<Chocolate> powder,liquid;

    ProcessFacade(){
        ChocolateProductionArea area = Factory.getInstance().getProductionArea();//获取唯一生产区
        smashArea = area.getSmashArea();
        meltArea = area.getMeltArea();
        freezeArea = area.getFreezeArea();
        criteria = new ChocolateCriteria();
        powder = new LinkedList<>();
        liquid = new LinkedList<>();
    }

    public void produceChocolate(){
        //从后往前模拟流水线
        System.out.println("======== 使用外观模式 ========");
        System.out.println("======== 使用过滤器模式 ========");
        List<IChocolate> chocolates = Factory.getInstance().getChocolates();
        while(chocolates.size()<100){
            //凝固塑形
            List<Chocolate> produced = criteria.meetCriteria(freezeArea.freeze(liquid));
            int offset = 100 - chocolates.size();
            if(offset<produced.size()){//加入全局巧克力list
                for(int i=0;i<offset;i++){
                    chocolates.add(produced.get(i));
                }
            }
            else chocolates.addAll(produced);
            //融化
            List<Chocolate> melted = meltArea.melt(powder);
            liquid.addAll(melted);
            //碾碎
            List<Chocolate> smashed = smashArea.smash();
            powder.addAll(smashed);
        }
    }
}
