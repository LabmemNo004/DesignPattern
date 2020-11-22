import org.junit.Test;
import Factory.Factory;

import static junit.framework.TestCase.assertTrue;

public class DoubleCheckedLockingTest {
    private Factory _factory;
    class MyThread implements Runnable{
        private int _id;
        MyThread(int id){
            _id = id;
        }
        @Override
        public void run() {
            System.out.println("线程 " + _id + " 启动");
            //确保工厂的初始化并且只初始化了一次
            assertTrue(_factory == null || Factory.getInstance() == _factory);
            _factory = Factory.getInstance();
            System.out.println("线程 "+ _id +" 获取了工厂实例,并结束线程");
        }
    }
    @Test
    public void test(){
        MyThread[] threads = new MyThread[10];
        for(int i = 0;i<10;i++){
            threads[i] = new MyThread(i);
        }

        for(MyThread thread : threads){
            thread.run();
        }
    }

}
