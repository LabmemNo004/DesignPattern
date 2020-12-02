package abstractfactory;

import org.junit.Test;

/**
 * @author Jasmine
 * @Date Created in 20:07 2020/12/1
 **/
public class AbstractFactoryDemoTest {

    @Test
    public void runAbstractFactoryDemo() {
        System.out.println("---------------- 测试设计模式：AbstractFactory 抽象工厂模式 ----------------");
        
        /**
         *新建3个成绩单，并展示每个成绩单的所有评价等级
         */
        AbstractFactoryDemo.runAbstractFactoryDemo();
        System.out.println("--------------------------------- END ----------------------------------");
    }
}