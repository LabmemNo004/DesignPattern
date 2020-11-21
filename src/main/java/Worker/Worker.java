package Worker;
//import Object.*;    hzj:这边object的作用是什么？？？？
import Chocolate.*;

public abstract class Worker extends Person {

    protected String type;
    protected Boolean state;

    public Worker(Attribute attribute,String type) {
        super(attribute);
        this.type=type;
        state=true;
    }

    public abstract Extension GetExtensionWoker(String extensionType);
    public abstract Chocolate work(Chocolate chocolate,Mould mould);//hzj：增加mould

    public String getWorkTypeString()
    {
        return type;
    }
    public abstract String getWorkTypeStringZh();

}
