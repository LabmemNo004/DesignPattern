package observer;

import org.junit.Test;

/**
 * @author Jasmine
 * @Date Created in 21:10 2020/12/1
 **/
public class ObserverTest {

    @Test
    public void observerTest(){

        System.out.println("----------------测试设计模式：Observer 观察者模式----------------");
        
        /**
         *创建两个比赛:游泳和跑步，每个比赛各创建裁判1和运动员2，随后裁判宣布比赛开始，通知到运动员
         */
        ObserverDemo.observerTest();
        System.out.println("----------------------------- END -----------------------------");
    }
}
