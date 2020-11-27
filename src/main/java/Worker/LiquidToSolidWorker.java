package Worker;
import Chocolate.*;
import FactoryParameter.Parameter;
import Mould.Mould;
import Servant.IWorked;

public class LiquidToSolidWorker extends Worker implements IWorked {
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
        chocolate.setState(Parameter.producedState);
        //do something
        return chocolate;
    }

    @Override
    public Chocolate worked(Chocolate chocolate,Mould mould){
        Chocolate _c=this.work(chocolate,mould);
        return _c;
    }

    @Override
    public Extension GetExtensionWorker() {
            return this._extension;
    }


    @Override
    public String getWorkTypeStringZh()
    {
        return "液转固";
    }
}
