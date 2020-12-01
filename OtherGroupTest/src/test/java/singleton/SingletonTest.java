package singleton;

import org.junit.Test;

/**
 * @Tester Neko
 * @Date: 16:08 2020/12/1
 **/

public class SingletonTest {
    @Test
    public void SingletonTest(){
        System.out.println("=============== TEST [Singleton] ===============");
        Sponsor Sponsor1 = Sponsor.getInstance();
        Sponsor Sponsor2 = Sponsor.getInstance();
        if(Sponsor1 == Sponsor2) {
            System.out.println("=====Create Sponsor1("+Sponsor1.toString()+") and Sponsor2("+Sponsor2.toString()+") are the same one.=====");
            System.out.println("=====The Sponsor's name is: "+Sponsor1.getName()+"=====");
        }
        else {
            System.out.println("=====Sponsor1("+Sponsor1.toString()+") and Sponsor2("+Sponsor2.toString()+") are not the same one.=====");
        }
        System.out.println("=============== TEST END ===============");
    }
}
