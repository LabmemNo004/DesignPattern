package Worker;
import Chocolate.*;
import Mould.Mould;

public class LiquidToSolidWorker extends Worker {
    private ConcreteExtension _extension;

    public LiquidToSolidWorker(Attribute attribute, String type) {
        super(attribute,type);
        _extension=new ConcreteExtension(this);
    }
    public Chocolate work(Chocolate chocolate,Mould mould)//hzj：增加Mould
    {
        //留言：模板模式
        System.out.println("=======使用 Template 模板模式======");
        System.out.println("----巧克力制作工序2：液转固-----");
        chocolate.setProduceStrategy(mould);
        chocolate.Produce();
        //do something
        return chocolate;
    }

    @Override
    public Extension GetExtensionWorker(String extensionType) {
        if(extensionType=="LiquidToSolid")
        {
            return this._extension;
        }
        return null;
    }

    @Override
    public String getWorkTypeStringZh()
    {
        return "液转固";
    }
}
