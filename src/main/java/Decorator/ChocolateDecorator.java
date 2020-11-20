package Decorator;

import Chocolate.IChocolate;
import Chocolate.Color;
import Chocolate.Mould;
import Chocolate.MouldShape;
import Chocolate.Items;
import java.io.Serializable;
import java.util.List;

public abstract class ChocolateDecorator extends Items implements Serializable, IChocolate {
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

    public void setName(String name){ System.out.println("In this step you cant do Set Operation");};
    //设置巧克力名字

    public void setSize(Mould.Size size){System.out.println("In this step you cant do Set Operation");};
    //设置巧克力型号

    public void setShape(MouldShape.Shapes shape){System.out.println("In this step you cant do Set Operation");};
    //设置巧克力形状

    public List<String> getPackInfo(){return obj.getPackInfo();};
    //获得巧克力外层包装信息

    public List<String> getPack(){return obj.getPack();};
    //获得巧克力外层包装实体

    public void addPack(String layer){obj.addPack(layer);};
    //增加巧克力最外层包装string（黑/白）

    public String deletePack(){return obj.deletePack();};
    //删除巧克力最外层包装

    public int getQuality(){return obj.getQuality();};
    //获取巧克力质量系数

    public void produce(Mould m){System.out.println("In this step you cant do Produce Operation");};
    // 为 size color shape price 赋值
    // 随机产生质量系数
    //         设置状态和名字

}
