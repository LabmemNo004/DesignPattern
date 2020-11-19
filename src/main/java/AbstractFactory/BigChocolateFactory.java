package AbstractFactory;

import Chocolate.*;

public class BigChocolateFactory {
    private BigMould _whiteSphericalMould;
    private BigMould _BlackSphericalMould;
    private BigMould _WhiteSquareMould;
    private BigMould _BlackSquareMould;
    private BigMould _WhiteStarMould;
    private BigMould _BlackStarMould;
    private BigMould _WhiteHeartMould;
    private BigMould _BlackHeartMould;

    public BigChocolateFactory(){
        System.out.println("============Abstract Factory============");
        this._whiteSphericalMould=null;
        this._BlackSphericalMould=null;
        this._WhiteSquareMould=null;
        this._BlackSquareMould=null;
        this._WhiteStarMould=null;
        this._BlackStarMould=null;
        this._WhiteHeartMould=null;
        this._BlackHeartMould=null;

        System.out.println("成功创建大号巧克力模具抽象");
    }
}