package Converter;

import Chocolate.Chocolate;
import Color.Color;
import Mould.Mould;
import Shaped.MouldShape;
import State.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimiFinishedChocolate {
    private Mould.Size size;//巧克力大小
    private MouldShape.Shapes shape;//巧克力形状
    private Color.Colors color;//巧克力颜色
    private int state;//巧克力状态，
    /*该变量需修改为State类型*/



    public SimiFinishedChocolate(Chocolate m){//存储巧克力在生产过程中的信息
        this.size=m.getSize();
        this.shape=m.getShape();
        this.color=m.getColor();
        this.state=m.getState();
    }

    public int getState1(){//获取巧克力半成品状态
        return state;

    }
    public int getState()
    {
        return state;
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
        return this.size == simiFinishedChocolate.getSize() &&
                this.shape == simiFinishedChocolate.getShape()&&
                this.state==simiFinishedChocolate.getState()&&
                this.color==simiFinishedChocolate.getColor();

    }

    //
    public static void simiToChoco(Chocolate chocolate,SimiFinishedChocolate simiFinishedChocolate){//让巧克力回退到某个状态
        chocolate.setState(simiFinishedChocolate.getState());
        chocolate.setColor(simiFinishedChocolate.getColor());
        chocolate.setSize(simiFinishedChocolate.getSize());
        chocolate.setShape(simiFinishedChocolate.getShape());
    }
    public Mould.Size getSize(){//获取巧克力型号
        return size;
    }//获取巧克力半成品大小

    public MouldShape.Shapes getShape(){//获取巧克力形状
        return shape;
    }//获取巧克力半成品形状

    public Color.Colors getColor(){
        return color;//获取巧克力半成品颜色
    }

}
