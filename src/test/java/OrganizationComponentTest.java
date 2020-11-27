import Area.ProcessChocolateArea.ChocolateProductionArea;
import Factory.Factory;
import OrganizationComponent.OrganizationComponent;
import Worker.Attribute;
import Worker.PowderToLiquidWorker;
import org.junit.Test;
public class OrganizationComponentTest {
    @Test
    public void main(){

        //从大到小创建对象
        OrganizationComponent factory = Factory.getInstance();

        //创建area
        OrganizationComponent productionArea = ((Factory)factory).getProductionArea();

        //创建工人
        Attribute p2laAttribute1 = new Attribute("p2l1", "2020-11-1", "男", 100.0);
        PowderToLiquidWorker p2lWorker1 = new PowderToLiquidWorker(p2laAttribute1, "PowderToLiquid");
        ((ChocolateProductionArea)productionArea).addFreeWorker(p2lWorker1);//加入普通粉转液工人
        System.out.println("");
        System.out.println("===========混合设计模式==========");
        System.out.println("打印factory");
        factory.print();
        System.out.println("打印area");
        productionArea.print();
    }
}
