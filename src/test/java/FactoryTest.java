import DeFactory.*;
import Land.Field;
import Land.LargeField;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void test() {
        System.out.println("测试小块土地工厂：");
        DeFactory fieldFactory = new FieldFactory();
        Field field1 = (Field) fieldFactory.create("建造 ChocolatePackagingArea(巧克力包装区)");
        System.out.println("创建一小块土地用来：" + field1.getUsage() + ".");
        field1.use();
        Field field2 = (Field) fieldFactory.create("建造 ChocolateSellArea(巧克力售卖区)");
        System.out.println("创建一小块土地用来： " + field2.getUsage() + ".");
        field2.use();
        Field field3 = (Field) fieldFactory.create("建造 RawMaterialManagementArea(原材料管理区)");
        System.out.println("创建一小块土地用来： " + field3.getUsage() + ".");
        field3.use();


        System.out.println("");
        System.out.println("测试大片土地工厂：");
        DeFactory largeFieldFactory = new LargeFieldFactory();
        LargeField largeField1 = (LargeField) largeFieldFactory.create("建造 ChocolateProductionArea(巧克力生产区)");
        System.out.println("创建一大块土地用来： " + largeField1.getUsage() + ".");
        largeField1.use();
    }
}
