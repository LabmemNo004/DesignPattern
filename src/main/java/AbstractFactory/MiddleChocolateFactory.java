package AbstractFactory;

import Chocolate.*;

public class MiddleChocolateFactory {
    private MiddleMould _WhiteSphericalMould;
    private MiddleMould _BlackSphericalMould;
    private MiddleMould _WhiteSquareMould;
    private MiddleMould _BlackSquareMould;
    private MiddleMould _WhiteStarMould;
    private MiddleMould _BlackStarMould;
    private MiddleMould _WhiteHeartMould;
    private MiddleMould _BlackHeartMould;

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
    }
    
    /**Abstract
     * 按照享元模式创建中号白巧圆形模具
     */
    public Mould createWhiteSphericalMould() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if (this._WhiteSphericalMould == null) {
            this._WhiteSphericalMould = new MiddleMould(new SphericalShaped(),new WhiteColor());
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
        }
        return this._BlackHeartMould;
    }
}
