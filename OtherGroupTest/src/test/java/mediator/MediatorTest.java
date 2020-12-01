package mediator;

import org.junit.Test;
/**
 * @TestBy: 1852346
 * @TestTime: 2020/12/01 21:00
 */

public class MediatorTest {
    @Test
    public void mediatorTest() {
        System.out.println("----------------[test] [Pattern] Mediator ----------------");
        DispatchMediator dispatchMediator = new DispatchMediator();
        TennisCourt tennisCourt = new TennisCourt(dispatchMediator);
        FootballCourt footballCourt = new FootballCourt(dispatchMediator);
        BasketballCourt basketballCourt = new BasketballCourt(dispatchMediator);

        dispatchMediator.setTennisCourt(tennisCourt);
        dispatchMediator.setFootballCourt(footballCourt);
        dispatchMediator.setBasketballCourt(basketballCourt);

        tennisCourt.changeStartTime("2");
        tennisCourt.borrow("BasketballCourt");
        footballCourt.borrow("BasketballCourt");

        System.out.println("------------------------[test] END ------------------------");
    }
}
