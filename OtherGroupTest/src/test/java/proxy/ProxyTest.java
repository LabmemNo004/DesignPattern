package proxy;

import entity.Athlete;
import org.junit.Test;

import java.util.ArrayList;

/*
 * @Author:Sophie
 * @Description:代理模式测试
 * @Date:2020/12/01 23:05
 * */
public class ProxyTest {
    @Test
    public void proxyTest() throws InterruptedException {
        System.out.println("---------------- 代理 Proxy 模式 ----------------");
//        定义运动员列表
        ArrayList<Athlete> athletes = new ArrayList<>();
//        加入运动员
        athletes.add(new Athlete("Amy", "长跑"));
        athletes.add(new Athlete("Bob", "跳远"));
        athletes.add(new Athlete("Candy", "游泳"));
//        运动员代理类，用运动员列表初始化
        AthleteProxy athletesProxy = new AthleteProxy(athletes);
//        记者类
        Reporter reporter = new Reporter("David");
//        问题数组
        String[] questions = {"你参加了什么项目？", "你对接下来的比赛有信心吗？", "你有什么目标？"};
//        采访
        reporter.interview(athletesProxy, "Amy", questions);
        reporter.interview(athletesProxy, "Bob", questions);
        reporter.interview(athletesProxy, "Eric", questions);

    }
}
