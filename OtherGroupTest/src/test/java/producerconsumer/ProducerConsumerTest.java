package producerconsumer;

import entity.Table;
import org.junit.Test;

/**
 * Author: Wenkai Tian
 * Date: 2020/12/1,15:45
 * Version: 1.0
 */
public class ProducerConsumerTest {

    @Test
    public void producerConsumerTest() {
        System.out.println("====== 测试 Producer-Customer设计模式 ======");

        Table table = new Table(2);
        MakerThread makerThreadTest1 = new MakerThread("makerThreadTest1",table,126);
        MakerThread makerThreadTest2 = new MakerThread("makerThreadTest2",table,3579);
        DrinkerThread drinkerThreadTest1 = new DrinkerThread("drinkerThreadTest1",table,111);
        DrinkerThread drinkerThreadTest2 = new DrinkerThread("drinkerThreadTest2",table,678);

        try{
            makerThreadTest1.start();
            makerThreadTest2.start();
            drinkerThreadTest1.start();
            drinkerThreadTest2.start();
            makerThreadTest1.join();
            makerThreadTest2.join();
            drinkerThreadTest1.join();
            drinkerThreadTest2.join();
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("====== 测试完毕 ======");
    }


}
