import DeFactory.*;
import Land.Field;
import Land.LargeField;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void test() {
        System.out.println("测试小块土地工厂：");
        DeFactory fieldFactory = new FieldFactory();
        Field field1 = (Field) fieldFactory.create("building ChocolatePackagingArea");
        System.out.println("Create a field for " + field1.getUsage() + ".");
        field1.use();
        Field field2 = (Field) fieldFactory.create("building ChocolateSellArea");
        System.out.println("Create a field for " + field2.getUsage() + ".");
        field2.use();
        Field field3 = (Field) fieldFactory.create("building RawMaterialManagementArea");
        System.out.println("Create a field for " + field3.getUsage() + ".");
        field3.use();


        System.out.println("");
        System.out.println("测试大片土地工厂：");
        DeFactory largeFieldFactory = new LargeFieldFactory();
        LargeField largeField1 = (LargeField) largeFieldFactory.create("building ChocolateProductionArea");
        System.out.println("Create a large field for " + largeField1.getUsage() + ".");
        largeField1.use();
    }
}
