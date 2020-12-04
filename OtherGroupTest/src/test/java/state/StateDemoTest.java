package state;

import org.junit.Test;

/**
 * @author Jasmine
 * @Date Created in 21:10 2020/12/1
 **/

public class StateDemoTest {

    @Test
    public void StateTest() {
        System.out.println("----------------测试设计模式：State 状态模式 ----------------");
        
        /**
         *两个运动员打乒乓，每一局打印两个运动员的状态，共有四个状态：playing比赛中/MatchPoint赛点/Win赢/Lose输
         */
    
        PingpongAthlete athlete1=new PingpongAthlete();
        PingpongAthlete athlete2=new PingpongAthlete();

        System.out.println("                                        [ PingpongAthlete : addScore() : 给运动员加分 ]");
        System.out.println("                                        [ PingpongAthlete : lost() : 运动员认输 ]");

        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        showGameState(athlete1, athlete2);
        athlete2.addScore();
        showGameState(athlete1, athlete2);
        athlete1.addScore();
        athlete2.lost();
        showGameState(athlete1, athlete2);
        System.out.println("--------------------------- END --------------------------");
    }
    
    private static void showGameState(PingpongAthlete athlete1,PingpongAthlete athlete2){
        System.out.println("Athlete1:");
        athlete1.showState();
        System.out.println("Athlete2:");
        athlete2.showState();
    }
}