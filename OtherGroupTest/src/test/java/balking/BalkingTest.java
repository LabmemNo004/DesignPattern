package balking;

import entity.Vest;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Author: Wenkai Tian
 * Date: 2020/12/1,15:07
 * Version: 1.0
 */
public class BalkingTest {

    @Test
    public void balkingTest(){
        System.out.println("====== 测试 Balking 犹豫设计模式======");
        ArrayList<Vest> balkingTestList = new ArrayList<Vest>();
        for (int i = 0; i < 10; i++) {
            Vest vestTest = new Vest(i);
            balkingTestList.add(vestTest);
        }

        ChangeThread changeThreadTest = new ChangeThread("Athlete",balkingTestList);
        SaveThread saveThreadTest = new SaveThread("Saver",balkingTestList);
        try{
            changeThreadTest.start();
            saveThreadTest.start();
            changeThreadTest.join();
            saveThreadTest.join();
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("====== 测试完毕 ======");
    }
}
