package Worker;

import Chocolate.Chocolate;
import FactoryParameter.Parameter;

public class Adapter extends PowderToLiquidWorker {
    private ConcreteExtension _extension;
    public Adapter(Worker liquidToSolidWorker) {
        super(liquidToSolidWorker.attribute, liquidToSolidWorker.type);
        System.out.println("使用适配器完成了一次工人的转换");
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
        System.out.println("----巧克力制作工序1：粉转液-----");
        chocolate.setState(Parameter.liquidState);
        //do something
        return chocolate;
    }
}
