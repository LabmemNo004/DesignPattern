package chainofresponsibility;

import entity.AbstractReferees;
import org.junit.Test;

/**
 * @Tester LabmemNo004
 * @Date: 17:56 2020/12/1
 **/

public class ChainOfResponsibilityTest {
    /**
     * 构造测试用例
     */
    private static final AbstractReferees referees = SetReferees.SetReferees("Unknown","Unknown",true);
    private static final AbstractReferees referees1 = SetReferees.SetReferees("Unknown","Goal",true);
    private static final AbstractReferees referees2 = SetReferees.SetReferees("Goal","Unknown",true);

    @Test
    public void ChainOfResponsibilityTest() {
        System.out.println("=============== TEST [ChainOfResponsibility] ===============");
        System.out.println("=============== TEST 1 ===============");
        referees.judgement();
        System.out.println("=============== TEST 2 ===============");
        referees1.judgement();
        System.out.println("=============== TEST 3 ===============");
        referees2.judgement();
        System.out.println("=============== TEST END ===============");
    }


}
