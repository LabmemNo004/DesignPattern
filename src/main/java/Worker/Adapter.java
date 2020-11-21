package Worker;
import Chocolate.*;

public class Adapter extends PowderToLiquidWorker{
    private ConcreteExtension _extension;
    public Adapter(LiquidToSolidWorker liquidToSolidWorker) {
        super(liquidToSolidWorker.attribute, liquidToSolidWorker.type);
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
        return null;
    }
}
