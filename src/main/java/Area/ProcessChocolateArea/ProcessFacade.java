package Area.ProcessChocolateArea;

import java.util.List;
import java.util.Queue;

import Criteria.ChocolateCriteria;
import Chocolate.Chocolate;
import Factory.Factory;

public class ProcessFacade {
    private SmashArea smashArea;
    private MeltArea meltArea;
    private FreezeArea freezeArea;
    private ChocolateCriteria criteria;
    private Queue<Chocolate> powder,liquid;

    ProcessFacade(){
        ChocolateProductionArea area = Factory.getInstance().getChocolateProductionArea();//获取唯一生产区
        smashArea = area.getSmashArea();
        meltArea = area.getMeltArea();
        freezeArea = area.getFreezeArea();
        criteria = new ChocolateCriteria();
    }

    public void produceChocolate(){
        //从后往前模拟流水线
        System.out.println("======== 使用外观模式 ========");
        System.out.println("======== 使用过滤器模式 ========");
        while(FactoryParameter._chocolates.size()<100){
            //凝固塑形
            List<Chocolate> produced = criteria.meetCriteria(freezeArea.freeze(liquid));
            int offset = 100 - FactoryParameter._chocolates.size();
            if(offset<produced.size()){//加入全局巧克力list
                for(int i=0;i<offset;i++){
                    FactoryParameter._chocolates.add(produced.get(i));
                }
            }
            else FactoryParameter._chocolates.addAll(produced);
            //融化
            List<Chocolate> melted = meltArea.melt(powder);
            liquid.addAll(melted);
            //碾碎
            List<Chocolate> smashed = smashArea.smash();
            powder.addAll(smashed);
        }
    }
}
