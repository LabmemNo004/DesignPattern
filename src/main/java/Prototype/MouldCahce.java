package Prototype;
import Color.BlackColor;
import Color.WhiteColor;
import Mould.*;
import Shaped.HeartShaped;
import Shaped.SphericalShaped;
import Shaped.SquareShaped;
import Shaped.StarShaped;


import java.io.Serializable;
import java.util.Hashtable;

public class MouldCahce implements Serializable {
    private static Hashtable<String, Mould> shapeMap
            = new Hashtable<String, Mould>();

    //静态方法，通过原型创建相同的模具
    public static Mould getShape(String shape) {
        System.out.println("========使用原型 Prototype 模式========");
        Mould cachedShape = shapeMap.get(shape);
        return (Mould) cachedShape.clone();
    }

    //将所有类型的模具装入hashmap中。
    //size:big,middle,small  color：white,black  shape:star,heart,spherical，square共24种模板
    public static void loadCache() {
        System.out.println("========将所有类型的模具加入模板哈希表中========");
        BigMould bigStarWhiteMould=new BigMould(new StarShaped(),new WhiteColor());
        shapeMap.put("bigStarWhite",bigStarWhiteMould);
        BigMould bigHeartWhiteMould=new BigMould(new HeartShaped(),new WhiteColor());
        shapeMap.put("bigHeartWhite",bigHeartWhiteMould);
        BigMould bigSquareWhiteMould=new BigMould(new SquareShaped(),new WhiteColor());
        shapeMap.put("bigSquareWhite",bigSquareWhiteMould);
        BigMould bigSphericalWhiteMould=new BigMould(new SphericalShaped(),new WhiteColor());
        shapeMap.put("bigSphericalWhite",bigSphericalWhiteMould);
        BigMould bigStarBlackMould=new BigMould(new StarShaped(),new BlackColor());
        shapeMap.put("bigStarBlack",bigStarBlackMould);
        BigMould bigHeartBlackMould=new BigMould(new HeartShaped(),new BlackColor());
        shapeMap.put("bigHeartBlack",bigHeartBlackMould);
        BigMould bigSquareBlackMould=new BigMould(new SquareShaped(),new BlackColor());
        shapeMap.put("bigSquareBlack",bigSquareBlackMould);
        BigMould bigSphericalBlackMould=new BigMould(new SphericalShaped(),new BlackColor());
        shapeMap.put("bigSphericalBlack",bigSphericalBlackMould);
        MiddleMould middleStarWhiteMould=new MiddleMould(new StarShaped(),new WhiteColor());
        shapeMap.put("middleStarWhite",middleStarWhiteMould);
        MiddleMould middleHeartWhiteMould=new MiddleMould(new HeartShaped(),new WhiteColor());
        shapeMap.put("middleHeartWhite",middleHeartWhiteMould);
        MiddleMould middleSquareWhiteMould=new MiddleMould(new SquareShaped(),new WhiteColor());
        shapeMap.put("middleSquareWhite",middleSquareWhiteMould);
        MiddleMould middleSphericalWhiteMould=new MiddleMould(new SphericalShaped(),new WhiteColor());
        shapeMap.put("middleSphericalWhite",middleSphericalWhiteMould);
        MiddleMould middleStarBlackMould=new MiddleMould(new StarShaped(),new BlackColor());
        shapeMap.put("middleStarBlack",middleStarBlackMould);
        MiddleMould middleHeartBlackMould=new MiddleMould(new HeartShaped(),new BlackColor());
        shapeMap.put("middleHeartBlack",middleHeartBlackMould);
        MiddleMould middleSquareBlackMould=new MiddleMould(new SquareShaped(),new BlackColor());
        shapeMap.put("middleSquareBlack",middleSquareBlackMould);
        MiddleMould middleSphericalBlackMould=new MiddleMould(new SphericalShaped(),new BlackColor());
        shapeMap.put("middleSphericalBlack",middleSphericalBlackMould);
        SmallMould smallStarWhiteMould=new SmallMould(new StarShaped(),new WhiteColor());
        shapeMap.put("smallStarWhite",smallStarWhiteMould);
        SmallMould smallHeartWhiteMould=new SmallMould(new HeartShaped(),new WhiteColor());
        shapeMap.put("smallHeartWhite",smallHeartWhiteMould);
        SmallMould smallSquareWhiteMould=new SmallMould(new SquareShaped(),new WhiteColor());
        shapeMap.put("smallSquareWhite",smallSquareWhiteMould);
        SmallMould smallSphericalWhiteMould=new SmallMould(new SphericalShaped(),new WhiteColor());
        shapeMap.put("smallSphericalWhite",smallSphericalWhiteMould);
        SmallMould smallStarBlackMould=new SmallMould(new StarShaped(),new BlackColor());
        shapeMap.put("smallStarBlack",smallStarBlackMould);
        SmallMould smallHeartBlackMould=new SmallMould(new HeartShaped(),new BlackColor());
        shapeMap.put("smallHeartBlack",smallHeartBlackMould);
        SmallMould smallSquareBlackMould=new SmallMould(new SquareShaped(),new BlackColor());
        shapeMap.put("smallSquareBlack",smallSquareBlackMould);
        SmallMould smallSphericalBlackMould=new SmallMould(new SphericalShaped(),new BlackColor());
        shapeMap.put("smallSphericalBlack",smallSphericalBlackMould);
    }

}
