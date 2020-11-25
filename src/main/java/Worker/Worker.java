package Worker;
//import Object.*;    hzj:这边object的作用是什么？？？？

import Chocolate.Chocolate;
import FactoryParameter.*;
import Mould.Mould;


public class Worker extends Person {

    protected String type;
    protected Boolean state;
    protected Parameter.WorkType workType;

    public int getWorkSpeed() {
        return workSpeed;
    }

    public void setWorkSpeed(int workSpeed) {
        this.workSpeed = workSpeed;
    }

    protected int workSpeed;

    private  Attribute  _attribute;
    public Worker(Attribute attribute)
    {
        super(attribute);
        state=true;
    }

    public Worker(Attribute attribute,String type) {
        super(attribute);
        this.type=type;
        state=true;
    }

    public Chocolate work(Chocolate chocolate, Mould mould)//hzj：增加Mould
    {
        System.out.println("工人开始工作");
        System.out.println("从事空闲工作的工人部队巧克力进行加工工作");
        System.out.println("工人结束工作");
        return chocolate;
    }

    public void setType(Parameter.WorkType type){
        this.workType=type;
    }

    public Parameter.WorkType getWorkType() {
        return workType;
    }

    public Extension GetExtensionWorker()
    {
        return null;
    }


    //hzj：增加mould

    public String getWorkTypeString()
    {
        return type;
    }
    public String getWorkTypeStringZh(){
        return null;
    }

}
