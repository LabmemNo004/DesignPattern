package AbstractFactory;

import Chocolate.*;
import Iterator.ObjectCollection;

public class BigChocolateFactory {
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
        }
        return this._BlackHeartMould;
    }
}