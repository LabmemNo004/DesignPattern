package Converter;

import Chocolate.Chocolate;
import Color.Color;
import Mould.Mould;
import Shaped.MouldShape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimiFinishedChocolate {
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

    public String getName() {
        return this.name;
    }
    public SimiFinishedChocolate(){//构造函数
        this.state=1;
    }

    public SimiFinishedChocolate(Chocolate m){//存储巧克力在生产过程中的信息
        this.size=m.getSize();
        this.shape=m.getShape();
        this.color=m.getColor();
        this.name=m.getName();
        this.quality= m.getQuality();
        this.state=m.getState();
        this.price=m.getPrice();
        Collections.copy(this.PackInfo, m.getPackInfo());
        Collections.copy(this.Pack, m.getPack());
    }
    public double getPrice(){//获取巧克力半成品价格
        return price;

    }
    public double getState(){//获取巧克力半成品价格
        return state;

    }
    public double getQuality(){//获取巧克力半成品质量
        return quality;
    }
    public static SimiFinishedChocolate getMemento(Chocolate chocolate){
        System.out.println("你正在获取chocolate的状态");
        return new SimiFinishedChocolate(chocolate);
    }

    //判断两个对象是否相等
    public boolean equals(Object o){
        SimiFinishedChocolate simiFinishedChocolate = null;
        try{
            simiFinishedChocolate = (SimiFinishedChocolate) o;
        }catch (ClassCastException e){
            System.out.println("Class Cast Error");
        }
        return this.name == simiFinishedChocolate.getName() &&
                this.size == simiFinishedChocolate.getSize() &&
                this.shape == simiFinishedChocolate.getShape()&&
                this.state==simiFinishedChocolate.getState()&&
                this.color==simiFinishedChocolate.getColor()&&
                this.price==simiFinishedChocolate.getPrice()&&
                this.quality==simiFinishedChocolate.getQuality();
    }

    //
    public static void simiToChoco(Chocolate chocolate,SimiFinishedChocolate simiFinishedChocolate){//让巧克力回退到某个状态
        //chocolate.setPrice(simiFinishedChocolate.getPrice());
        //chocolate.setState(simiFinishedChocolate.getState());
    }
    public Mould.Size getSize(){//获取巧克力型号
        return size;
    }

    public MouldShape.Shapes getShape(){//获取巧克力形状
        return shape;
    }

    public Color.Colors getColor(){
        return color;//获取巧克力半成品颜色
    }

    public List<String> getPackInfo(){//获得巧克力半成品外层包装信息
        return PackInfo;

    }

    public List<String>getPack(){//获得巧克力半成品外层包装实体
        return Pack;

    }
}
