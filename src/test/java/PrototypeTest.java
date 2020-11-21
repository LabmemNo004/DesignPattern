import Chocolate.Mould;
import Prototype.MouldCahce;

public class PrototypeTest {
    public static void main(String[] args) {
        MouldCahce.loadCache();
        System.out.println("======测试 Prototype 原型模式======");
        Mould clonedShape1 = (Mould) MouldCahce.getShape("bigStarWhite");
        System.out.println("Size: "+clonedShape1.getSize()+"   Shape: " + clonedShape1.getShape()+"   Color: "+clonedShape1.getColor());
        Mould clonedShape2 = (Mould) MouldCahce.getShape("middleSquareBlack");
        System.out.println("Size: "+clonedShape2.getSize()+"   Shape: " + clonedShape2.getShape()+"   Color: "+clonedShape2.getColor());
        Mould clonedShape3 = (Mould) MouldCahce.getShape("smallHeartBlack");
        System.out.println("Size: "+clonedShape3.getSize()+"   Shape: " + clonedShape3.getShape()+"   Color: "+clonedShape3.getColor());
        Mould clonedShape4 = (Mould) MouldCahce.getShape("bigStarBlack");
        System.out.println("Size: "+clonedShape4.getSize()+"   Shape: " + clonedShape4.getShape()+"   Color: "+clonedShape4.getColor());
    }

}
