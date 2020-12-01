package doublecheckedlocking;

import org.junit.Test;


/**
 * Author: hzj
 * Time: 2020-12-01
 */
public class DoubleCheckedLockingTest {


    @Test
    public void test(){
        System.out.println("----------------Test [Pattern] DoubleCheckedLocking ----------------");
        MyThread[] threads = new MyThread[10];
        for(int i = 0;i<10;i++){
            threads[i] = new MyThread(i);
        }

        for(MyThread thread : threads){
            thread.run();
        }
        System.out.println("------------------------ Over ------------------------");
    }
}
