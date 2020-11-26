import Chocolate.Chocolate;
import Color.WhiteColor;
import DeFactory.*;
import Land.Field;
import MVC.ChocolateController;
import MVC.ChocolateView;
import Mould.Mould;
import Shaped.StarShaped;
import org.junit.Test;

public class LazyInitializationTest {
    @Test
    public void main(){
        System.out.println("测试Lazy Initialization模式：");
        System.out.println("创建小块土地工厂进行测试：");
        FieldFactory fieldFactory = new FieldFactory();
        Field field1 = (Field) fieldFactory.create("building ChocolatePackagingArea");
        System.out.println("Create a field for " + field1.getUsage() + ".");
        field1.use();
        Field field2 = (Field) fieldFactory.create("building ChocolateSellArea");
        System.out.println("Create a field for " + field2.getUsage() + ".");
        field2.use();
        //Field field3 = (Field) fieldFactory.create("building RawMaterialManagementArea");
        //System.out.println("Create a field for " + field3.getUsage() + ".");
        //field3.use();
        System.out.println("");
        System.out.println("获取usage为"+"building ChocolatePackagingArea"+"的Land:");
        fieldFactory.getLand("building ChocolatePackagingArea");
        System.out.println("");
        System.out.println("获取usage为"+"building ChocolateSellArea"+"的Land:");
        fieldFactory.getLand("building ChocolateSellArea");
        System.out.println("");
        System.out.println("获取usage为"+"building RawMaterialManagementArea"+"的Land:");
        fieldFactory.getLand("building RawMaterialManagementArea");
    }
}
