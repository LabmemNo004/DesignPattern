import Color.WhiteColor;
import Converter.SimiFinishedChocolate;
import Converter.ChocolateConverter;
import Chocolate.Chocolate;
import Mould.BigMould;
import Shaped.StarShaped;
import org.junit.Assert;
import org.junit.Test;


public class ConverterTest {
    @Test
    public void test() {
        //创建一个巧克力和摸具
        Chocolate chocolate = new Chocolate();
        BigMould bigStarWhiteMould=new BigMould(new StarShaped(),new WhiteColor());
        //用模具初始化巧克力
        chocolate.setSSC(bigStarWhiteMould);
        SimiFinishedChocolate memento = SimiFinishedChocolate.getMemento(chocolate);
        ChocolateConverter converter = new ChocolateConverter();
        Chocolate chocolate1=converter.convertFromDto(memento);
        if(chocolate1.getState()==memento.getState()
                &&chocolate1.getColor()==memento.getColor()
                &&chocolate1.getShape()==memento.getShape()
                &&chocolate1.getSize()==memento.getSize())
            System.out.println("从dto转化为实体对象转换成功");
        SimiFinishedChocolate simiFinishedChocolate=converter.convertFromEntity(chocolate);
        if(chocolate.getState()==simiFinishedChocolate.getState()
                &&chocolate.getColor()==simiFinishedChocolate.getColor()
                &&chocolate.getShape()==simiFinishedChocolate.getShape()
                &&chocolate.getSize()==simiFinishedChocolate.getSize())
            System.out.println("从实体对象转化为dto对象转换成功");
    }
}
