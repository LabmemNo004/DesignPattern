package composite;

import org.junit.Test;

/**
 * @author Jasmine
 * @Date Created in 20:20 2020/12/1
 **/

public class CompositeTest {
    @Test
    public void compositetest()
    {

        System.out.println("----------------测试设计模式：Composite 组合模式 ----------------");
        
        Equipment basketball=new Equipment("篮球",80);
        Equipment football=new Equipment("足球",50);
        
        Locker Ball=new Locker("球形柜");
        Locker Square=new Locker("方形柜");
        Ball.add(Square);

        /**
         *在方形柜这个划分下面添加具体的篮球和足球两个运动器材。
         */
        Square.add(basketball).add(football);

        Ball.printList();
        System.out.println("");
        Square.getFullCategory();
        
        /**
         *在球形柜这个划分下面添加具体的体操表演球这一个运动器材。
         */
        Equipment GymnasticsExhibitionBall=new Equipment("体操表演球",300);
        Ball.add(GymnasticsExhibitionBall);

        Ball.printList();
        System.out.println("");
        GymnasticsExhibitionBall.getFullCategory();

        System.out.println("---------------------------- END -----------------------------");

    }


}
