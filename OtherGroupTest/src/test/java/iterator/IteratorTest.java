package iterator;


import entity.SportsMan;
import org.junit.Test;
/**
 * Author: Wenkai Tian
 * Date: 2020/12/1,15:35
 * Version: 1.0
 */
public class IteratorTest {

    @Test
    public void iteratortest() {

        System.out.println("====== 测试 Iterator 迭代器设计模式======");

        ManCollection manCollectionTest=new ManCollection(8);
        manCollectionTest.appendMan(new SportsMan("金角 ",204));
        manCollectionTest.appendMan(new SportsMan("银角 ",201));
        manCollectionTest.appendMan(new SportsMan("红孩儿 ",8));
        manCollectionTest.appendMan(new SportsMan("铁扇公主 ",145));
        manCollectionTest.appendMan(new SportsMan("牛魔王 ",818));
        manCollectionTest.appendMan(new SportsMan("蜘蛛精 ",518));
        manCollectionTest.appendMan(new SportsMan("女儿国王 ",30));
        manCollectionTest.appendMan(new SportsMan("小魔仙 ",18));
        MenuIterator menuIteratorTest=manCollectionTest.iterator();
        /**
         * 迭代器遍历一个collection输出相关信息
         */
        while (menuIteratorTest.hasNext()) {
            SportsMan man = (SportsMan) menuIteratorTest.next();
            System.out.println("姓名 "+man.getName()+"年龄 "+man.getAge());
        }

        System.out.println("====== 测试完毕 ======");

    }
}
