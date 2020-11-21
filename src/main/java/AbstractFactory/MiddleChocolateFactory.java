package AbstractFactory;

import Chocolate.*;
import Iterator.Iterator;
import Iterator.ObjectCollection;


public class MiddleChocolateFactory extends AbstractChocolateFactory{
    private MiddleMould _WhiteSphericalMould;
    private MiddleMould _BlackSphericalMould;
    private MiddleMould _WhiteSquareMould;
    private MiddleMould _BlackSquareMould;
    private MiddleMould _WhiteStarMould;
    private MiddleMould _BlackStarMould;
    private MiddleMould _WhiteHeartMould;
    private MiddleMould _BlackHeartMould;
    private ObjectCollection<MiddleMould>MiddleMouldCollection;//中型模具的集合，使用iterator模式

    public MiddleChocolateFactory(){
        System.out.println("============Abstract Factory============");
        this._WhiteSphericalMould=null;
        this._BlackSphericalMould=null;
        this._WhiteSquareMould=null;
        this._BlackSquareMould=null;
        this._WhiteStarMould=null;
        this._BlackStarMould=null;
        this._WhiteHeartMould=null;
        this._BlackHeartMould=null;

        System.out.println("成功创建中号巧克力模具抽象");
        MiddleMouldCollection=new ObjectCollection<MiddleMould>();
    }
    
    /**Abstract
     * 按照享元模式创建中号白巧圆形模具
     */
    public Mould createWhiteSphericalMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteSphericalMould == null) {
            this._WhiteSphericalMould = new MiddleMould(new SphericalShaped(),new WhiteColor());
            MiddleMouldCollection.add(_WhiteSphericalMould);
        }
        return this._WhiteSphericalMould;
    }
    /**
     * 按照享元模式创建中号黑巧圆形模具
     */
    public Mould createBlackSphericalMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackSphericalMould == null) {
            this._BlackSphericalMould = new MiddleMould(new SphericalShaped(),new BlackColor());
            MiddleMouldCollection.add(_BlackSphericalMould);
        }
        return this._BlackSphericalMould;
    }
    /**
     * 按照享元模式创建中号白巧方形模具
     */
    public Mould createWhiteSquareMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteSquareMould == null) {
            this._WhiteSquareMould =  new MiddleMould(new SquareShaped(),new WhiteColor());
            MiddleMouldCollection.add(_WhiteSphericalMould);
        }
        return this._WhiteSquareMould;
    }
    /**
     * 按照享元模式创建中号黑巧方形模具
     */
    public Mould createBlackSquareMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackSquareMould == null) {
            this._BlackSquareMould = new MiddleMould(new SquareShaped(),new BlackColor());
            MiddleMouldCollection.add(_BlackSquareMould);
        }
        return this._BlackSquareMould;
    }
    /**
     * 按照享元模式创建中号白巧星形模具
     */
    public Mould createWhiteStarMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteStarMould == null) {
            this._WhiteStarMould = new MiddleMould(new StarShaped(),new WhiteColor());
            MiddleMouldCollection.add(_WhiteStarMould);
        }
        return this._WhiteStarMould;
    }
    /**
     * 按照享元模式创建中号黑巧星形模具
     */
    public Mould createBlackStarMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackStarMould == null) {
            this._BlackStarMould = new MiddleMould(new StarShaped(),new BlackColor());
            MiddleMouldCollection.add(_BlackStarMould);
        }
        return this._BlackStarMould;
    }
    /**
     * 按照享元模式创建中号白巧心形模具
     */
    public Mould createWhiteHeartMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteHeartMould == null) {
            this._WhiteHeartMould = new MiddleMould(new HeartShaped(),new WhiteColor());
            MiddleMouldCollection.add(_WhiteHeartMould);
        }
        return this._WhiteHeartMould;
    }
    /**
     * 按照享元模式创建中号黑巧心形模具
     */
    public Mould createBlackHeartMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackHeartMould == null) {
            this._BlackHeartMould = new MiddleMould(new HeartShaped(),new BlackColor());
            MiddleMouldCollection.add(_BlackHeartMould);
        }
        return this._BlackHeartMould;
    }

    @Override
    public void useIterator() {
        Iterator<MiddleMould> iter=MiddleMouldCollection.iterator();
        if(iter.hasNext()){
            System.out.println("MiddleChocolateFactory中已创建的模具信息如下:");
            while(iter.hasNext()){
                System.out.println("模具"+(iter.getPoint()+1)+":");
                iter.next().getInfo();
                System.out.println();
            }
        }
        else{
            System.out.println("MiddleChocolateFactory中暂时没有模具信息!");
        }

    }
}
