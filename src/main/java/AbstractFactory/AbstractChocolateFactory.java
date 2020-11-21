package AbstractFactory;

import Mould.Mould;

public abstract class AbstractChocolateFactory {
	
	/**Abstract
     * 按照享元模式创建白巧圆形模具
     */
    public abstract Mould createWhiteSphericalMould();
    
    /**
     * 按照享元模式创建黑巧圆形模具
     */
    public abstract Mould createBlackSphericalMould();
    
    /**
     * 按照享元模式创建白巧方形模具
     */
    public abstract Mould createWhiteSquareMould();
    
    /**
     * 按照享元模式创建黑巧方形模具
     */
    public abstract Mould createBlackSquareMould();
    
    /**
     * 按照享元模式创建白巧星形模具
     */
    public abstract Mould createWhiteStarMould();
    
    /**
     * 按照享元模式创建黑巧星形模具
     */
    public abstract Mould createBlackStarMould();
    
    /**
     * 按照享元模式创建白巧心形模具
     */
    public abstract Mould createWhiteHeartMould();
    
    /**
     * 按照享元模式创建黑巧心形模具
     */
    public abstract Mould createBlackHeartMould();
    public void createAllMould(){
        createBlackHeartMould();
        createWhiteHeartMould();
        createBlackSphericalMould();
        createWhiteSphericalMould();
        createBlackSquareMould();
        createWhiteSquareMould();
        createBlackStarMould();
        createWhiteStarMould();
    }

    public abstract void useIterator();//使用迭代器
}
