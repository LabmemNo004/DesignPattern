package AbstractFactory;

import Color.BlackColor;
import Color.WhiteColor;
import Iterator.Iterator;
import Iterator.ObjectCollection;
import Mould.Mould;
import Mould.SmallMould;
import Shaped.HeartShaped;
import Shaped.SphericalShaped;
import Shaped.SquareShaped;
import Shaped.StarShaped;

public class SmallChocolateFactory extends AbstractChocolateFactory{
    private SmallMould _WhiteSphericalMould;
    private SmallMould _BlackSphericalMould;
    private SmallMould _WhiteSquareMould;
    private SmallMould _BlackSquareMould;
    private SmallMould _WhiteStarMould;
    private SmallMould _BlackStarMould;
    private SmallMould _WhiteHeartMould;
    private SmallMould _BlackHeartMould;
    private ObjectCollection<SmallMould>SmallMouldCollection;//小型模具的集合，使用iterator模式

    public SmallChocolateFactory(){
        System.out.println("============Abstract Factory============");
        this._WhiteSphericalMould=null;
        this._BlackSphericalMould=null;
        this._WhiteSquareMould=null;
        this._BlackSquareMould=null;
        this._WhiteStarMould=null;
        this._BlackStarMould=null;
        this._WhiteHeartMould=null;
        this._BlackHeartMould=null;

        System.out.println("成功创建小号巧克力模具抽象");
        SmallMouldCollection=new ObjectCollection<SmallMould>();
    }
    
    /**Abstract
     * 按照享元模式创建小号白巧圆形模具
     */
    public Mould createWhiteSphericalMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteSphericalMould == null) {
            this._WhiteSphericalMould = new SmallMould(new SphericalShaped(),new WhiteColor());
            SmallMouldCollection.add(_WhiteSphericalMould);
        }
        return this._WhiteSphericalMould;
    }
    /**
     * 按照享元模式创建小号黑巧圆形模具
     */
    public Mould createBlackSphericalMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackSphericalMould == null) {
            this._BlackSphericalMould = new SmallMould(new SphericalShaped(),new BlackColor());
            SmallMouldCollection.add(_BlackSphericalMould);
        }
        return this._BlackSphericalMould;
    }
    /**
     * 按照享元模式创建小号白巧方形模具
     */
    public Mould createWhiteSquareMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteSquareMould == null) {
            this._WhiteSquareMould =  new SmallMould(new SquareShaped(),new WhiteColor());
            SmallMouldCollection.add(_WhiteSquareMould);
        }
        return this._WhiteSquareMould;
    }
    /**
     * 按照享元模式创建小号黑巧方形模具
     */
    public Mould createBlackSquareMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackSquareMould == null) {
            this._BlackSquareMould = new SmallMould(new SquareShaped(),new BlackColor());
            SmallMouldCollection.add(_BlackSquareMould);
        }
        return this._BlackSquareMould;
    }
    /**
     * 按照享元模式创建小号白巧星形模具
     */
    public Mould createWhiteStarMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteStarMould == null) {
            this._WhiteStarMould = new SmallMould(new StarShaped(),new WhiteColor());
            SmallMouldCollection.add(_WhiteStarMould);
        }
        return this._WhiteStarMould;
    }
    /**
     * 按照享元模式创建小号黑巧星形模具
     */
    public Mould createBlackStarMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackStarMould == null) {
            this._BlackStarMould = new SmallMould(new StarShaped(),new BlackColor());
            SmallMouldCollection.add(_BlackStarMould);
        }
        return this._BlackStarMould;
    }
    /**
     * 按照享元模式创建小号白巧心形模具
     */
    public Mould createWhiteHeartMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteHeartMould == null) {
            this._WhiteHeartMould = new SmallMould(new HeartShaped(),new WhiteColor());
            SmallMouldCollection.add(_WhiteHeartMould);
        }
        return this._WhiteHeartMould;
    }
    /**
     * 按照享元模式创建小号黑巧心形模具
     */
    public Mould createBlackHeartMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackHeartMould == null) {
            this._BlackHeartMould = new SmallMould(new HeartShaped(),new BlackColor());
            SmallMouldCollection.add(_BlackHeartMould);
        }
        return this._BlackHeartMould;
    }

    public ObjectCollection<SmallMould> getSmallMouldCollection(){
        this.createAllMould();
        return SmallMouldCollection;
    }

    @Override
    public void useIterator() {
        Iterator<SmallMould> iter=SmallMouldCollection.iterator();
        if(iter.hasNext()){
            System.out.println("SmallChocolateFactory中已创建的模具信息如下:");
            while(iter.hasNext()){
                System.out.println("模具"+(iter.getPoint()+1)+":");
                iter.next().getInfo();
                System.out.println();
            }
        }
        else{
            System.out.println("SmallChocolateFactory中暂时没有模具信息!");
        }

    }
}
