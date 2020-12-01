package immutable;

import org.junit.Test;

/**
 * @Author: wjm
 * @Date: Created in 2020/12/01
 */
public class ImmutableTest {

    @Test
    public void immutableTest(){
        System.out.println("===========Immutable Test===========");
        try {
            ImmutableDemo.immutableTest();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("===========Immutable Test End===========");
    }
}
