package Worker;
//import Object.*;    hzj:这边object的作用是什么？？？？

import FactoryParameter.*;


public abstract class Worker extends Person {

    protected String type;
    protected Boolean state;

    private  Attribute  _attribute;
    public Worker(Attribute attribute,String type) {
        super(attribute);
        this.type=type;
        state=true;
    }


    public void setType(Parameter.WorkType type){
        _attribute.setType(type);
    }

    public Parameter.WorkType getWorkType() {
        return _attribute.getWorkType();
    }

    public abstract Extension GetExtensionWoker(String extensionType);
    //hzj：增加mould

    public String getWorkTypeString()
    {
        return type;
    }
    public abstract String getWorkTypeStringZh();

}
