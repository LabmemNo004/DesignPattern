package Worker;
import Chocolate.*;
import Mould.Mould;


public class PowderToLiquidWorker extends Worker {
    private ConcreteExtension _extension;

    public PowderToLiquidWorker(Attribute attribute, String type) {
        super(attribute,type);
        _extension=new ConcreteExtension(this);
    }
    public Chocolate work(Chocolate chocolate, Mould mould)
    {
        System.out.println("----巧克力制作工序1：粉转液-----");
        chocolate.Produce(mould);
        //do something
        return chocolate;
    }

    @Override
    public Extension GetExtensionWoker(String extensionType) {
        if(extensionType=="PowderToLiquid")
        {
            return this._extension;
        }
        return null;
    }

    @Override
    public String getWorkTypeStringZh()
    {
        return "粉转液";
    }

}
