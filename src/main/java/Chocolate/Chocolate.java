package Chocolate;

import Mediator.ChocolateMediator;
import Mediator.Colleague;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Strategy.*;

/*巧克力类*/
public class Chocolate extends Items implements IChocolate,Colleague{
    private String name;//巧克力的名字，即巧克力的基本信息，eg:small square white chocolate
    private Mould.Size size;//巧克力大小
    private MouldShape.Shapes shape;//巧克力形状
    private Color.Colors color;//巧克力颜色
    private int state;//巧克力状态，11为待生产的粉末状，12为待生产的液体状，可以理解为原料，2为生产完，3为装饰完，4为已销售
    /*该变量需修改为State类型*/
    private int quality;//质量系数,随机产生,{0,1,2}
    private double price;//巧克力价格
    protected ArrayList<String> PackInfo ;//巧克力外层包装信息
    protected ArrayList<String> Pack; //巧克力外层包装实体

    protected ChocolateMediator chocolateMediator;//巧克力监察者

    private  ChocolateShaping strategy;//巧克力塑形

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCount() {
        return 1;
    }

    public Chocolate(){//构造函数
        this.state=1;
    }

    public void Produce(Mould m){//生产巧克力
        this.size=m.getSize();
        this.shape=m.getShape();
        this.color=m.getColor();
        this.name=size+" "+shape+" "+color+" "+"chocolate";
        Random r=new Random();
        this.quality= r.nextInt(2);
        this.state=2;
        setPrice();
    }

    public void Shaping(ChocolateShaping strategy){//为巧克力塑形
        this.strategy=strategy;
    }

    public double getPrice(){//获取巧克力价格
        return price;

    }
    public Mould.Size getSize(){//获取巧克力型号
        return size;
    }

    public MouldShape.Shapes getShape(){//获取巧克力形状
        return shape;
    }

    public Color.Colors getColor(){
        return color;//获取巧克力颜色
    }

    public List<String> getPackInfo(){//获得巧克力外层包装信息
        return PackInfo;

    }

    public List<String>getPack(){//获得巧克力外层包装实体
        return Pack;

    }

    public void addPack(String pack){//增加巧克力最外层包装string（黑/白）
        Pack.add(pack);
    }
    public String deletePack(){//删除巧克力最外层包装
        return Pack.remove(Pack.size()-1);

    }
    public int getQuality(){//获得巧克力质量
        return quality;
    }

    @Override
    public void setPrice() {
        /*int sizePrice= FactoryParameter.chocolatePrice.get(size.toString());
        int shapePrice= FactoryParameter.chocolatePrice.get(shape.toString());
        int colorPrice= FactoryParameter.chocolatePrice.get(color.toString());
        price=sizePrice+shapePrice+colorPrice;*/

    }

    @Override
    public void setState() {
        /*this.state.jump;*/
    }

    @Override
    public int getState() {
        return state;
        //return this.state.getValue();
    }

    @Override
    public void setMediator(ChocolateMediator chocolateMediator)
    {
        this.chocolateMediator=chocolateMediator;
    }

    @Override
    public void setColleagueReport() {//更新状态，包装区包装完毕调用
        chocolateMediator.colleagueReport();
    }

    public ChocolateMediator getMediator()
    {
        return chocolateMediator;
    }

    /*public void produceSmallChocolate();
    public void produceMiddleChocolate();
    public void produceBigChocolate();*/

}
