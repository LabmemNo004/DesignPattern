package nullobject;

import entity.Coach;

import java.util.Vector;

/**
 * 空对象模式 Demo 类
 * 拥有一个静态方法，用于运行空对象模式的 Demo
 * @Tester transparency
 * @Date 20:06 2020/12/1
 */
public class NullObjectTestDemo {
    public static void runNullObjectDemo(){
        Coach coach = new Coach();
        Vector<String> list = new Vector<String>();     //运动员名单
        list.add("Abby");
        list.add("Bob");
        list.add("Cindy");
        list.add("David");
        System.out.println("{Coach:named(Vector<String> list, String name):教练点名}");
        coach.named(list, "Jason").play();        //点到不存在的人
        coach.named(list,"Abby").play();          //点名上场
        coach.named(list,"Daivy").play();         //点到不存在的人
    }
}
