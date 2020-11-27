import FluentInterface.FormalOutputInterface;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class FluentInterfaceTest {
    @Test
    public void main()
    {
        FormalOutputInterface sql = new FormalOutputInterface();
        sql.from("ChocolateSellArea").where("quality=2", "size=big","color=white");
        String query = sql.getOutput();
        System.out.println(query);
    }
}
