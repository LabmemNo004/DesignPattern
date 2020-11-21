package Decorator;

import Chocolate.Chocolate;
import Chocolate.IChocolate;
import Color.Color;
import Mediator.ChocolateMediator;
import Mould.Mould;
import Shaped.MouldShape;
import Item.Items;
import Visitor.ChocolateVisitor;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class ChocolateDecorator  implements Serializable, IChocolate {
    protected IChocolate obj;

    public ChocolateDecorator(IChocolate obj){
        this.obj=obj;
        System.out.println("Create: "+this.getClass()+" @"+this.hashCode());
    }
    /**
     * Decorator重写不相干的方法
     */
    @Override
    public String getName() {
        return obj.getName();
    }

    @Override
    public Mould.Size getSize(){return obj.getSize();};
    //获得巧克力型号

    public MouldShape.Shapes getShape(){return obj.getShape();};
    //获得巧克力形状

    public Color.Colors getColor(){return obj.getColor();};
    //获得巧克力颜色

    public ArrayList<String> getPackInfo(){return obj.getPackInfo();};
    //获得巧克力外层包装信息

    public ArrayList<String> getPack(){return obj.getPack();};
    //获得巧克力外层包装实体

    public void addPack(String layer){obj.addPack(layer);};
    //增加巧克力最外层包装string（黑/白）

    public String deletePack(){return obj.deletePack();};
    //删除巧克力最外层包装

    public int getQuality(){return obj.getQuality();};
    //获取巧克力质量系数

    public int getState(){return getState();}
    //查看巧克力状态

    public void setSSC(Mould m){obj.setSSC(m);};
    //设置巧克力型号，形状，颜色的信息
    public void setState(int state){obj.setState(state);};
    //设置巧克力状态
    public void setPrice(double p){obj.setPrice(p);};
    //设置巧克力价格
    public void Produce(){obj.Produce();};
    // 为 size color shape price 赋
    // 随机产生质量系
    public void setMediator(ChocolateMediator chocolateMediator){obj.setMediator(chocolateMediator);};

    public void accept(ChocolateVisitor chocolateVisitor){obj.accept(chocolateVisitor);};

    public ChocolateMediator getMediator(){return obj.getMediator();};
    //设置监察官

    public Chocolate getChocolate(){return obj.getChocolate();};



}
