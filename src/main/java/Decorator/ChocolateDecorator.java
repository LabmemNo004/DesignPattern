package Decorator;

import Chocolate.Chocolate;
import Chocolate.IChocolate;
import Color.Color;
import Mediator.ChocolateMediator;
import Memento.Memento;
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

    public MouldShape.Shapes getShape(){return obj.getShape();};

    public Color.Colors getColor(){return obj.getColor();};

    public ArrayList<String> getPackInfo(){return obj.getPackInfo();};

    public ArrayList<String> getPack(){return obj.getPack();};

    public void addPack(String layer){obj.addPack(layer);};

    public String deletePack(){return obj.deletePack();};

    public int getQuality(){return obj.getQuality();};

    public int getState(){return obj.getState();}

    public void setSSC(Mould m){obj.setSSC(m);};

    public void setState(int state){obj.setState(state);};

    public void setPrice(double p){obj.setPrice(p);};

    public void Produce(){obj.Produce();};

    public void setMediator(ChocolateMediator chocolateMediator){obj.setMediator(chocolateMediator);};

    public void accept(ChocolateVisitor chocolateVisitor){obj.accept(chocolateVisitor);};

    public ChocolateMediator getMediator(){return obj.getMediator();};

    public Chocolate getChocolate(){return obj.getChocolate();};

    public Memento createMemento(){return obj.createMemento();}

    public void reinstateMemento(Memento mem) {
        obj.reinstateMemento(mem);
    }
}
