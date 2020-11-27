package Worker;
import Chocolate.*;
import FactoryParameter.Parameter;
import Mould.Mould;
import Servant.IWorked;

public class PowderToLiquidWorker extends Worker implements IWorked {
    private ConcreteExtension _extension;

    public PowderToLiquidWorker(Attribute attribute, String type) {
        super(attribute,type);
        System.out.println("----使用构造函数模式生成了一个对象-----");
        _extension=new ConcreteExtension(this);
    }

    public Chocolate work(Chocolate chocolate)
    {
        //留言：模板模式
        System.out.println("=======使用 Template 模板模式======");
        System.out.println("----巧克力制作工序1：粉转液-----");
        chocolate.setState(Parameter.liquidState);
        //do something
        return chocolate;
    }

    @Override
    public Chocolate worked(Chocolate chocolate, Mould mould){
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
        return "粉转液";
    }

}
