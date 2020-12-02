package flyweight;

import entity.Game;
import entity.SportType;

/**
 * @Tester transparency
 * @Date 19:53 2020/12/1
 */
public class FlyWeightTestDemo {

    /*
     * @Tester transparency
     * @Date 20:03 2020/12/1
     * 
     * @param 
     * @return void
     */ 
    public static void flyWeightTest(){
        System.out.println("{Game:Game():构造函数，创建比赛}");
        Game game1 = new Game(SportType.run);
        Game game2 = new Game(SportType.run);
        Game game3 = new Game(SportType.run);
        System.out.println("=============== TEST ===============");
        System.out.println("{Game:assignReferee():尝试为比赛分配裁判（使用了享元模式）}");
        game1.assignReferee();
        System.out.println("{Game:getReferee():获取为比赛分配好的裁判}");
        System.out.println("跑步比赛1的裁判是：" + game1.getReferee().getName());
        System.out.println("{Game:assignReferee():尝试为比赛分配裁判（使用了享元模式）}");
        game2.assignReferee();
        System.out.println("{Game:getReferee():获取为比赛分配好的裁判}");
        System.out.println("跑步比赛2的裁判是：" + game2.getReferee().getName());
        //让1号裁判空闲，再为跑步比赛3分配裁判，测试享元模式
        System.out.println("{Game:over():终止某一场比赛，修改该比赛的裁判的状态为free}");
        game1.over();
        System.out.println("跑步比赛1结束!");
        System.out.println("{Game:assignReferee():尝试为比赛分配裁判（使用了享元模式）}");
        game3.assignReferee();
        System.out.println("{Game:getReferee():获取为比赛分配好的裁判}");
        System.out.println("跑步比赛3的裁判是：" + game3.getReferee().getName());
    }
}
