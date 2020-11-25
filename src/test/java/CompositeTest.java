import Chocolate.*;
import org.junit.Test;
import Pocket.Pocket;

public class CompositeTest {
    @Test
    public void test()
    {
        System.out.println("======= 测试 Composite 模式 =======");
        Pocket originPocket=new Pocket("OriginPocket",5);
        System.out.println("背包"+originPocket.getName()+" ,已满:"+originPocket.isFull());
        Pocket childPocket1=new Pocket("childPocket1",2);
        System.out.println("背包"+childPocket1.getName()+" ,已满:"+childPocket1.isFull());
        Pocket childPocket2=new Pocket("childPocket2",6);
        System.out.println("背包"+childPocket2.getName()+" ,已满:"+childPocket2.isFull());

        Chocolate chocolate1=new Chocolate();
        chocolate1.setName("白色星形大巧克力");
        System.out.println("生产"+chocolate1.getName());
        Chocolate chocolate2=new Chocolate();
        chocolate2.setName("黑色方形小巧克力");
        System.out.println("生产"+chocolate2.getName());
        Chocolate chocolate3=new Chocolate();
        chocolate3.setName("白色球形小巧克力");
        System.out.println("生产"+chocolate3.getName()+"\n");

        originPocket.add(chocolate1);

        childPocket1.add(chocolate1);
        childPocket1.add(chocolate1);
        childPocket1.add(chocolate1);

        originPocket.add(childPocket1);
        originPocket.add(chocolate2);

        childPocket2.add(chocolate2);
        childPocket2.add(chocolate1);
        childPocket2.add(chocolate3);

        originPocket.add(childPocket2);
        originPocket.add(chocolate3);

        System.out.println("\n背包"+originPocket.getName()+"现在有"+originPocket.getCount()+"个巧克力");
        System.out.println("背包"+childPocket1.getName()+"现在有"+childPocket1.getCount()+"个巧克力");
        System.out.println("背包"+childPocket2.getName()+"现在有"+childPocket2.getCount()+"个巧克力"+"\n");

        System.out.println("背包"+originPocket.getName()+" ,已满:"+originPocket.isFull());
        System.out.println("背包"+childPocket1.getName()+" ,已满:"+childPocket1.isFull());
        System.out.println("背包"+childPocket2.getName()+" ,已满:"+childPocket2.isFull());

    }
}
