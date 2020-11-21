import org.junit.Test;
import Constant.Const;

import static org.junit.Assert.assertEquals;

public class InterpreterTest {
    @Test
    public void test() throws ParseException {
        double ret = Parser.parse("1 + 2 * 3"+" + "+ Const.VALUE_BIG_SPHERICAL_BLACK).interpret();
        assertEquals(ret, 1 + 2 * 3 + Const.VALUE_BIG_SPHERICAL_BLACK, 0.0);

        ret = Parser.parse("1 + 2 * 3"+" * "+ Const.VALUE_BIG_SPHERICAL_BLACK).interpret();
        assertEquals(ret, 1 + 2 * 3 * Const.VALUE_BIG_SPHERICAL_BLACK, 0.0);
    }

}
