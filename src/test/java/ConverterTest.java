import Converter.SimiFinishedChocolate;
import Converter.ChocolateConverter;
import Chocolate.Chocolate;
import Chocolate.BigMould;
import Chocolate.StarShaped;
import Chocolate.WhiteColor;
import org.junit.Assert;
import org.junit.Test;


public class ConverterTest {
    @Test
    public void test() {
        //创建一个巧克力和摸具
        Chocolate chocolate = new Chocolate();
        BigMould bigStarWhiteMould=new BigMould(new StarShaped(),new WhiteColor());
        //用模具初始化巧克力
        chocolate.Produce(bigStarWhiteMould);
        SimiFinishedChocolate memento = SimiFinishedChocolate.getMemento(chocolate);

        ChocolateConverter converter = new ChocolateConverter();
        Assert.assertEquals(chocolate, converter.convertFromDto(memento));
        Assert.assertEquals(memento, converter.convertFromEntity(chocolate));
    }
}
