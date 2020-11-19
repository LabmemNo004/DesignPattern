package AbstractFactory;

import Chocolate.*;

public class SmallChocolateFactory {
    private SmallMould _whiteSphericalMould;
    private SmallMould _BlackSphericalMould;
    private SmallMould _WhiteSquareMould;
    private SmallMould _BlackSquareMould;
    private SmallMould _WhiteStarMould;
    private SmallMould _BlackStarMould;
    private SmallMould _WhiteHeartMould;
    private SmallMould _BlackHeartMould;

    public SmallChocolateFactory(){
        System.out.println("============Abstract Factory============");
        this._whiteSphericalMould=null;
        this._BlackSphericalMould=null;
        this._WhiteSquareMould=null;
        this._BlackSquareMould=null;
        this._WhiteStarMould=null;
        this._BlackStarMould=null;
        this._WhiteHeartMould=null;
        this._BlackHeartMould=null;

        System.out.println("成功创建小号巧克力模具抽象");
    }
}
