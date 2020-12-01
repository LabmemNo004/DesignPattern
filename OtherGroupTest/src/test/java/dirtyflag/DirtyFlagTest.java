package dirtyflag;

import org.junit.Test;

import java.util.ArrayList;
/**
 * Author: Wenkai Tian
 * Date: 2020/12/1,15:25
 * Version: 1.0
 */
public class DirtyFlagTest {
    @Test
    public void dirtyFlagTest() throws InterruptedException {
        System.out.println("====== 测试 DirtyFlag 设计模式 ======");
//        设置队伍
        RelayRaceTeam relayRaceTeamTest1 = new RelayRaceTeam("测试队一", "悟空", "八戒", "沙僧",
                60, 28, 35);
        RelayRaceTeam relayRaceTeamTest2 = new RelayRaceTeam("测试队二", "白骨精", "嫦娥", "玉兔",
                48, 37, 29);
//        设置队伍列表
        ArrayList<RelayRaceTeam> DirtyFlagTestList = new ArrayList<>();
        DirtyFlagTestList.add(relayRaceTeamTest1);
        DirtyFlagTestList.add(relayRaceTeamTest2);
//        构造比赛类实例
        RelayRace relayRaceTest = new RelayRace(DirtyFlagTestList);
//        开始比赛
        relayRaceTest.start();
        System.out.println("====== 测试完毕 ======");
    }
}
