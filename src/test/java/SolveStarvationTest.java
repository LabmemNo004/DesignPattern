import Area.ChocolatePackagingArea;
import Area.ChocolateSellArea;
import Area.ProcessChocolateArea.ChocolateProductionArea;
import Factory.Factory;
import Mould.BigMould;
import Shaped.StarShaped;
import SolveStarvation.SolveStarvationFacade;
import org.junit.Test;

import java.util.Scanner;


public class SolveStarvationTest {
    @Test
    public void test() {
        Factory factory = Factory.getInstance();
        ChocolateProductionArea productionArea = factory.getProductionArea();//获取唯一生产区

        ChocolateSellArea sellArea = factory.getSellArea();//获取唯一销售区
        ChocolatePackagingArea packagingArea = factory.getPackageArea();//获取唯一包装区

        SolveStarvationFacade solveStarvationFacadeProduct = new SolveStarvationFacade(productionArea);
        SolveStarvationFacade solveStarvationFacadeSell = new SolveStarvationFacade(sellArea);
        SolveStarvationFacade solveStarvationFacadePackage = new SolveStarvationFacade(packagingArea);

        boolean flag=true;
        while(flag)
        {
            System.out.println("================================================================");
            System.out.println("               我们采用责任链模式来解决工人就餐这一问题                  ");
            System.out.println("               每个区域(area)的仓库中都默认有100份食物                  ");
            System.out.println("               当区域仓库中的食物消耗完毕，则由Charlie购买食物解决         ");
            System.out.println("                     请选择以下区域：                     ");
            System.out.println("                 ProductArea(默认一次消耗10份)                     ");
            System.out.println("                 SellArea(默认一次消耗20份)                        ");
            System.out.println("                 PackageArea(默认一次消耗10份)                     ");
            System.out.println("================================================================");
            Scanner input = new Scanner(System.in);
            String inputStr = input.next();
            switch (inputStr) {
                case "ProductArea":
                    solveStarvationFacadeProduct.solve(10);
                    break;
                case "SellArea":
                    solveStarvationFacadeSell.solve(20);
                    break;
                case "PackageArea":
                    solveStarvationFacadePackage.solve(10);
                    break;
                default:
                    System.out.println("Wrong Enter");
                    break;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("是否继续？y/n");
            Scanner in = new Scanner(System.in);
            String inStr = in.next();
            switch (inStr) {
                case "y":
                case "yes":
                    flag=true;
                    break;
                case "n":
                case "no":
                    flag=false;
                    break;
                default:
                    flag=true;
                    break;
            }

        }
    }
}
