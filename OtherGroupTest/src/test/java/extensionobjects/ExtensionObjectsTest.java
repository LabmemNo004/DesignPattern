package extensionobjects;

import org.junit.Test;

/**
 * @TestBy: 1852346
 * @TestTime: 2020/12/01 21:00
 */

public class ExtensionObjectsTest {
    @Test

    public void ExtensionObjectsTest (){
        System.out.println("----------------[test] [Pattern] ExtensionObjects ----------------");
        Race race = new ConcreteRace();
        Overtime overtimeInjury = race.GetExtension("Injury");
        Overtime overtimeDraw = race.GetExtension("Draw");
        overtimeInjury.SetOvertime(5);
        overtimeDraw.SetOvertime(15);
        System.out.println("------------------------ [test]END ------------------------");
    }
}
