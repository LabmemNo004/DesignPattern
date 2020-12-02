package state;

import org.junit.Test;

/**
 * @author Jasmine
 * @Date Created in 21:10 2020/12/1
 **/

public class StateDemoTest {

    @Test
    public void runStateDemo() {
        System.out.println("----------------测试设计模式：State 状态模式 ----------------");
        
        /**
         *两个运动员打乒乓，每一局打印两个运动员的状态，共有四个状态：playing比赛中/MatchPoint赛点/Win赢/Lose输
         */
        StateDemo.runStateDemo();
        System.out.println("--------------------------- END --------------------------");
    }
}