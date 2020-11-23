package Worker;
import Chocolate.*;
import FactoryParameter.Parameter;

public class Adapter extends PowderToLiquidWorker{
    private ConcreteExtension _extension;
    public Adapter(Worker worker) {
        super(worker.attribute, worker.type);
    }

    public Extension GetExtensionWoker(String extensionType) {
        if(extensionType=="xxxx")
        {
            return this._extension;
        }
        return null;
    }

    @Override
    public Chocolate work(Chocolate chocolate) {
        System.out.println("=======使用 Template 模板模式======");
        System.out.println("----巧克力制作工序1：粉转液-----");
        chocolate.setState(Parameter.liquidState);
        //do something
        return chocolate;

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
