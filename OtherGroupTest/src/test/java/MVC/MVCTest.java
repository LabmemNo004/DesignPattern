package MVC;

import iterator.ManCollection;
import iterator.MenuIterator;
import entity.SportsMan;
import org.junit.Test;
/**
 * @Tester LabmemNo004
 * @Date: 18:28 2020/12/1
 **/
public class MVCTest {
    @Test
    public void MVCtest()
    {

        System.out.println("=============== TEST [MVC] ===============");

        ManCollection manCollection=new ManCollection(5);
        manCollection.appendMan(new SportsMan("Rita ",22));
        manCollection.appendMan(new SportsMan("K423 ",18));
        manCollection.appendMan(new SportsMan("Otto ",566));
        manCollection.appendMan(new SportsMan("Durandal ",17));
        manCollection.appendMan(new SportsMan("Fu Hua ",54000));

        SportsMan man;
        SportsManView testView=new SportsManView();

        MenuIterator iter=manCollection.iterator();

        while (iter.hasNext()) {
            /**
             * 使用controller遍历运动员列表，用View打印运动员信息。
             */
            man = (SportsMan) iter.next();
            SportsManController testController=new SportsManController(man,testView);
            testController.printDetails(testController.getManName(),testController.getManAge());
        }

        MenuIterator iters=manCollection.iterator();
        man = (SportsMan) iters.next();
        SportsManController testController=new SportsManController(man,testView);
        /**
         * controller改变对应运动员的信息。
         */
        System.out.println("=================");

        testController.printDetails(testController.getManName(),testController.getManAge());

        System.out.println("=====Reset ======");
        testController.setManName("Rossweisse");
        testController.setManAge(23);

        testController.printDetails(testController.getManName(),testController.getManAge());

        System.out.println("=============== TEST END ===============");

    }
}
