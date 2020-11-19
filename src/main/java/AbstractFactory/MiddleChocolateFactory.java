package AbstractFactory;

import Chocolate.*;

public class MiddleChocolateFactory {
    private MiddleMould _whiteSphericalMould;
    private MiddleMould _BlackSphericalMould;
    private MiddleMould _WhiteSquareMould;
    private MiddleMould _BlackSquareMould;
    private MiddleMould _WhiteStarMould;
    private MiddleMould _BlackStarMould;
    private MiddleMould _WhiteHeartMould;
    private MiddleMould _BlackHeartMould;

    public MiddleChocolateFactory(){
        System.out.println("============Abstract Factory============");
        this._whiteSphericalMould=null;
        this._BlackSphericalMould=null;
        this._WhiteSquareMould=null;
        this._BlackSquareMould=null;
        this._WhiteStarMould=null;
        this._BlackStarMould=null;
        this._WhiteHeartMould=null;
        this._BlackHeartMould=null;

        System.out.println("成功创建中号巧克力模具抽象");
    }
}
