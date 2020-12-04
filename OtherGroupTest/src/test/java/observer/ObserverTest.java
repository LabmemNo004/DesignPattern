package observer;

import org.junit.Test;

import entity.Game;
import entity.Referee;
import entity.SportType;

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
        //ObserverDemo.observerTest();
        System.out.println("                                        [ Game : Game() : 构造函数， 创建比赛 ]");
        Game swimGame1 = new Game(SportType.swim);
        Game runGame1 = new Game(SportType.run);

        System.out.println("                                        [ RunAthlete : RunAthlete() : 构造函数， 创建跑步运动员 ]");
        RunAthlete runAthlete1 = new RunAthlete("1号跑步运动员");
        RunAthlete runAthlete2 = new RunAthlete("2号跑步运动员");
        System.out.println("                                        [ Game : addAthlete() : 为比赛添加运动员 ]");
        runGame1.addAthlete(runAthlete1);
        runGame1.addAthlete(runAthlete2);
        System.out.println("                                        [ Game : assignReferee() : 尝试为比赛分配裁判（使用了享元模式） ]");
        runGame1.assignReferee();
        System.out.println("                                        [ Game : getReferee() : 获取为比赛分配好的裁判 ]");
        Referee runReferee1 = runGame1.getReferee();

        System.out.println("                                        [ SwimAthlete : SwimAthlete() : 构造函数， 创建游泳运动员 ]");
        SwimAthlete swimAthlete1 = new SwimAthlete("1号游泳运动员");
        SwimAthlete swimAthlete2 = new SwimAthlete("2号游泳运动员");
        System.out.println("                                        [ Game : addAthlete() : 为比赛添加运动员 ]");
        swimGame1.addAthlete(swimAthlete1);
        swimGame1.addAthlete(swimAthlete2);
        System.out.println("                                        [ Game : assignReferee() : 尝试为比赛分配裁判（使用了享元模式） ]");
        swimGame1.assignReferee();
        System.out.println("                                        [ Game : getReferee() : 获取为比赛分配好的裁判 ]");
        Referee swimReferee1 = swimGame1.getReferee();

        System.out.println("                                        [ Referee : announce() : 裁判宣布比赛开始， 通知所有运动员开始比赛 ]");
        System.out.println(runReferee1.getName() + "宣布1号跑步比赛开始！");
        runReferee1.announce();

        System.out.println("                                        [ Referee : announce() : 裁判宣布比赛开始， 通知所有运动员开始比赛 ]");
        System.out.println(swimReferee1.getName() + "宣布1号游泳比赛开始！");
        swimReferee1.announce();
        System.out.println("----------------------------- END -----------------------------");
    }
}
