package Area.ProcessChocolateArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// import AbstractFactory.AbstractChocolateFactory;
import AbstractFactory.BigChocolateFactory;
import AbstractFactory.SmallChocolateFactory;
import  AbstractFactory.MiddleChocolateFactory;
import Color.Color.Colors;
import Mould.BigMould;
import Mould.MiddleMould;
import Mould.Mould;
import Mould.SmallMould;
import Factory.Factory;
import Iterator.Iterator;
import Iterator.ObjectCollection;
import Chocolate.Chocolate;
import Area.RawMaterialManagementArea;
import Worker.LiquidToSolidWorker;
import Worker.*;
public class FreezeArea extends WorkerProduceLink{
    private ObjectCollection<Mould> moulds;
    private Iterator<Mould> iterator;

    public FreezeArea(){
        BigChocolateFactory bigChocolateFactory = new BigChocolateFactory();
        MiddleChocolateFactory middleChocolateFactory = new MiddleChocolateFactory();
        SmallChocolateFactory smallChocolateFactory = new SmallChocolateFactory();
        bigChocolateFactory.createAllMould();
        middleChocolateFactory.createAllMould();
        smallChocolateFactory.createAllMould();
        moulds = new ObjectCollection<Mould>();
        Iterator<BigMould> bigIterator = bigChocolateFactory.getBigMouldCollection().iterator();
        while(bigIterator.hasNext()){moulds.add(bigIterator.next());}
        Iterator<SmallMould> smallIterator = smallChocolateFactory.getSmallMouldCollection().iterator();
        while(smallIterator.hasNext()){moulds.add(smallIterator.next());}
        Iterator<MiddleMould> middleIterator = middleChocolateFactory.getMiddleMouldCollection().iterator();
        while(middleIterator.hasNext()){moulds.add(middleIterator.next());}
        iterator = moulds.iterator();
    }
    //使用模具凝固
    public List<Chocolate> freeze(Queue<Chocolate> liquid) {
        List<Chocolate> chocolates = new ArrayList<>();
        for(Worker w:getWorkers()){
            LiquidToSolidWorker worker = (LiquidToSolidWorker)w;
            Chocolate chocolate = liquid.poll();//获取液体巧克力
            if(chocolate==null)break;
            freezeChocolate(worker, chocolates, chocolate);
            if(worker.getWorkTypeString().equals("SuperLiquidToSolid")){
                Chocolate _chocolate = liquid.poll();//获取液体巧克力
                if(_chocolate==null)break;
                freezeChocolate(worker, chocolates, _chocolate);
            }
        }
        return chocolates;
    }

    private void freezeChocolate(LiquidToSolidWorker worker,List<Chocolate> chocolates,Chocolate chocolate){
        RawMaterialManagementArea area = Factory.getInstance().getManageArea();
        // int mouldIdx = (int)Math.random()*100%moulds.getSize();//随机获取模具列表的索引
        //     Mould mould = moulds.get(mouldIdx);//获取对应模具
        Mould mould;
        if(iterator.hasNext())mould = iterator.next();
        else {
            iterator = moulds.iterator();
            mould = iterator.next();
        }
        // chocolate.produce(mould);//赋值
        worker.work(chocolate,mould);//生产工人将巧克力从液体变为固体
        //减少原料
        if(mould.getColor()==Colors.black)area.blackProduce();
        else area.whiteProduce();
        System.out.println("生产了一份巧克力");
        chocolates.add(chocolate);
    }
}
