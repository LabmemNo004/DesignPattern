import Area.ChocolatePackagingArea;
import Area.ChocolateSellArea;
import Area.ProcessChocolateArea.ChocolateProductionArea;
import Factory.Factory;
import Mould.BigMould;
import Shaped.StarShaped;
import SolveStarvation.SolveStarvationFacade;
import org.junit.Test;


public class SolveStarvationTest {
    @Test
    public void test() {
        Factory factory = Factory.getInstance();
        ChocolateProductionArea productionArea = factory.getProductionArea();//获取唯一生产区

        ChocolateSellArea sellArea = factory.getSellArea();//获取唯一销售区
        ChocolatePackagingArea packagingArea = factory.getPackageArea();//获取唯一包装区

        SolveStarvationFacade solveStarvationFacade = new SolveStarvationFacade(productionArea);
        solveStarvationFacade.solve(10);
    }
}
