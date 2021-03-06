package Chocolate;

import Color.Color;
import Item.Items;
import Mediator.ChocolateMediator;
import Memento.Memento;
import Mould.*;
import Shaped.MouldShape;
import State.*;
import Strategy.ProduceBigChocolate;
import Strategy.ProduceChocolate;
import Strategy.ProduceMiddleChocolate;
import Strategy.ProduceSmallChocolate;
import Visitor.ChocolateVisitor;
import Mediator.Colleague;
import FactoryParameter.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/*巧克力类*/
public class Chocolate extends Items implements IChocolate,Colleague{
    private String name;//巧克力的名字，即巧克力的基本信息，eg:small square white chocolate
    private Mould.Size size;//巧克力大小
    private MouldShape.Shapes shape;//巧克力形状
    private String comment;//Charlie作为工厂管理者，对巧克力的评价
    private String nickName;//由于Charlie比较喜欢某款巧克力，给巧克力取了一个别致的名字
    private Color.Colors color;//巧克力颜色
    private final Context state;//巧克力的状态
    private int quality;//质量系数,随机产生,{0,1,2}
    private double price;//巧克力价格
    protected ArrayList<String> PackInfo ;//巧克力外层包装信息
    protected ArrayList<String> Pack; //巧克力外层包装实体

    protected ChocolateMediator chocolateMediator;//巧克力监察者

    private ProduceChocolate produceStrategy;//生产巧克力策略

    /*private  ChocolateShaping strategy;//巧克力塑形*/

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {this.name=name;}//仅为了Pocket测试使用

    @Override
    public int getCount() {
        return 1;
    }

    public Chocolate(){//构造函数
        this.state=new Context();
        System.out.println("生成一个巧克力实例...");
        System.out.println("当前状态："+state.getStateName());
        PackInfo = new ArrayList<>();//留言：需要先初始化后续才能调用
        Pack = new ArrayList<>();//留言：需要先初始化后续才能调用
        this.PackInfo.add("black");
        this.PackInfo.add("black");
        this.PackInfo.add("white");
        this.PackInfo.add("white");
        this.PackInfo.add("black");
        this.PackInfo.add("white");
    }

    public void setProduceStrategy(Mould m){
        switch (m.getSize().toString()){
            case "big":
                produceStrategy=new ProduceBigChocolate((BigMould)m);
                break;//留言：加break退出switch
            case "middle":
                produceStrategy=new ProduceMiddleChocolate((MiddleMould)m);
                break;
            case "small":
                produceStrategy=new ProduceSmallChocolate((SmallMould)m);
                break;
        }
    }

    public void Produce(){//生产巧克力,调用Produce之前，先调用setProduceStrategy
        if(produceStrategy==null){
            System.out.println("先设置produceStrategy!");
            return;
        }
        produceStrategy.doShape(this);
    }

    /*public void Shaping(ChocolateShaping strategy){//为巧克力塑形
        this.strategy=strategy;
    }*/

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

    @Override
    public void setSSC(Mould m) {//设置巧克力型号，形状，大小等信息
        this.size=m.getSize();
        this.shape=m.getShape();
        this.color=m.getColor();
        this.name=size+" "+shape+" "+color+" "+"chocolate";
    }

    public ArrayList<String> getPackInfo(){//获得巧克力外层包装信息
        return PackInfo;

    }

    public ArrayList<String>getPack(){//获得巧克力外层包装实体
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

    public void setQuality(int quality) {//设置巧克力质量
        this.quality = quality;
    }

    //留言：转换器模式需要对巧克力里面的属性操作，故加了设置巧克力color,size,shape,state的函数
    public void setSize(Mould.Size size)//设置巧克力的大小
    {
        this.size=size;
    }

    public void setShape(MouldShape.Shapes shape)//设置巧克力的形状
    {
        this.shape=shape;
    }

    public void setColor(Color.Colors color)//设置巧克力的颜色
    {
        this.color=color;
    }

    public void setPrice(double p){//Charlie作为工厂的管理者，有权修改某款巧克力的价格，通过ChococlateController
        price=p;
    }//设置巧克力价格

    public void setComment(String comment){//Charlie作为工厂的管理者，有权评价巧克力，通过ChococlateController
        this.comment=comment;
    }

    public void setNickname(String name){//Charlie作为工厂的管理者，有权给巧克力取一个别致的名字，通过ChococlateController
        nickName=name;
    }

    public String getComment(){
        return comment;
    }

    public String getNickname(){
        return nickName;
    }

    @Override
    public void setState(int state) {
        this.state.setState(state);
    }

    @Override
    public int getState() {
        return state.getState();
    }

    @Override
    public void setMediator(ChocolateMediator chocolateMediator)
    {
        this.chocolateMediator=chocolateMediator;
    }

    @Override
    public void accept(ChocolateVisitor chocolateVisitor){
        chocolateVisitor.visit(this);
    }

    @Override
    public void setColleagueReport() {//更新状态，包装区包装完毕调用
        chocolateMediator.colleagueReport();
    }

    public ChocolateMediator getMediator()
    {
        return chocolateMediator;
    }

    @Override
    public Chocolate getChocolate() {
        return this;
    }

    @Override
    public Memento createMemento() {
        return new Memento(this.Pack);
    }

    @Override
    public void reinstateMemento(Memento mem) {
        this.Pack=mem.getState();
    }

    /*public void produceSmallChocolate();
    public void produceMiddleChocolate();
    public void produceBigChocolate();*/

}
