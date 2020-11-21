package AbstractFactory;

import Chocolate.*;
import Iterator.Iterator;
import Iterator.ObjectCollection;

public class BigChocolateFactory extends AbstractChocolateFactory{
    private BigMould _WhiteSphericalMould;
    private BigMould _BlackSphericalMould;
    private BigMould _WhiteSquareMould;
    private BigMould _BlackSquareMould;
    private BigMould _WhiteStarMould;
    private BigMould _BlackStarMould;
    private BigMould _WhiteHeartMould;
    private BigMould _BlackHeartMould;
    private ObjectCollection<BigMould>BigMouldCollection;//大型模具的集合，使用iterator模式

    public BigChocolateFactory(){
        System.out.println("============Abstract Factory============");
        this._WhiteSphericalMould=null;
        this._BlackSphericalMould=null;
        this._WhiteSquareMould=null;
        this._BlackSquareMould=null;
        this._WhiteStarMould=null;
        this._BlackStarMould=null;
        this._WhiteHeartMould=null;
        this._BlackHeartMould=null;
        System.out.println("成功创建大号巧克力模具抽象");
        BigMouldCollection=new ObjectCollection<BigMould>();
    }
    
    /**Abstract
     * 按照享元模式创建大号白巧圆形模具
     */
    public Mould createWhiteSphericalMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteSphericalMould == null) {
            this._WhiteSphericalMould = new BigMould(new SphericalShaped(),new WhiteColor());
            BigMouldCollection.add(_WhiteSphericalMould);//将新创建的模具加入集合中
        }
        return this._WhiteSphericalMould;
    }
    /**
     * 按照享元模式创建大号黑巧圆形模具
     */
    public Mould createBlackSphericalMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackSphericalMould == null) {
            this._BlackSphericalMould = new BigMould(new SphericalShaped(),new BlackColor());
            BigMouldCollection.add(_BlackSphericalMould);
        }
        return this._BlackSphericalMould;
    }
    /**
     * 按照享元模式创建大号白巧方形模具
     */
    public Mould createWhiteSquareMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteSquareMould == null) {
            this._WhiteSquareMould =  new BigMould(new SquareShaped(),new WhiteColor());
            BigMouldCollection.add(_WhiteSquareMould);
        }
        return this._WhiteSquareMould;
    }
    /**
     * 按照享元模式创建大号黑巧方形模具
     */
    public Mould createBlackSquareMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackSquareMould == null) {
            this._BlackSquareMould = new BigMould(new SquareShaped(),new BlackColor());
            BigMouldCollection.add(_BlackSquareMould);
        }
        return this._BlackSquareMould;
    }
    /**
     * 按照享元模式创建大号白巧星形模具
     */
    public Mould createWhiteStarMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteStarMould == null) {
            this._WhiteStarMould = new BigMould(new StarShaped(),new WhiteColor());
            BigMouldCollection.add(_WhiteStarMould);
        }
        return this._WhiteStarMould;
    }
    /**
     * 按照享元模式创建大号黑巧星形模具
     */
    public Mould createBlackStarMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackStarMould == null) {
            this._BlackStarMould = new BigMould(new StarShaped(),new BlackColor());
            BigMouldCollection.add(_BlackStarMould);
        }
        return this._BlackStarMould;
    }
    /**
     * 按照享元模式创建大号白巧心形模具
     */
    public Mould createWhiteHeartMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteHeartMould == null) {
            this._WhiteHeartMould = new BigMould(new HeartShaped(),new WhiteColor());
            BigMouldCollection.add(_WhiteHeartMould);
        }
        return this._WhiteHeartMould;
    }
    /**
     * 按照享元模式创建大号黑巧心形模具
     */
    public Mould createBlackHeartMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._BlackHeartMould == null) {
            this._BlackHeartMould = new BigMould(new HeartShaped(),new BlackColor());
            BigMouldCollection.add(_BlackHeartMould);
        }
        return this._BlackHeartMould;
    }

    @Override
    public void useIterator() {//对模具集合使用迭代器进行遍历
        Iterator<BigMould>iter=BigMouldCollection.iterator();
        if(iter.hasNext()){
            System.out.println("BigChocolateFactory中已创建的模具信息如下:");
            while(iter.hasNext()){
                System.out.println("模具"+(iter.getPoint()+1)+":");
                iter.next().getInfo();
                System.out.println();
            }
        }
        else{
            System.out.println("BigChocolateFactory中暂时没有模具信息!");
        }




    }
}