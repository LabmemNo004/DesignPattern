import org.junit.Test;
import FactoryParameter.Parameter;

import static org.junit.Assert.assertEquals;
import Interpreter.ParseException;
import Interpreter.Parser;

public class InterpreterTest {
    @Test
    public void test() throws ParseException {
        double ret = Parser.parse("1 + 2 * 3"+" + "+ Parameter.VALUE_BIG_SPHERICAL_BLACK).interpret();
        assertEquals(ret, 1 + 2 * 3 + Parameter.VALUE_BIG_SPHERICAL_BLACK, 0.0);

        ret = Parser.parse("1 + 2 * 3"+" * "+ Parameter.VALUE_BIG_SPHERICAL_BLACK).interpret();
        assertEquals(ret, 1 + 2 * 3 * Parameter.VALUE_BIG_SPHERICAL_BLACK, 0.0);
    }

}
