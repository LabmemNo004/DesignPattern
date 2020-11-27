import FluentInterface.FormalOutputInterface;
import org.junit.Test;



public class FluentInterfaceTest {
    @Test
    public void main()
    {
        System.out.println("=====使用流接口模式======");
        FormalOutputInterface sql = new FormalOutputInterface();
        sql.from("ChocolateSellArea").where("quality=2", "size=big","color=white");
        String query = sql.getQuery();
        System.out.println(query);
    }
}
