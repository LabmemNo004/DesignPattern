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
            System.out.println("线程 " + _id + " 开始启动");
            //确保农场并且只初始化了一次
            assertTrue(_farm == null || Farm.getInstance() == _farm);
            _farm = Farm.getInstance();
            System.out.println("线程 "+ _id +" 获取了农场实例并结束了它短暂的一生");
        }
    }
    @Test
    public void main(){
        System.out.println("Test main!\n");
    }

}
