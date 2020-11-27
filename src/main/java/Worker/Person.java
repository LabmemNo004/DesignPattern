package Worker;

import OrganizationComponent.OrganizationComponent;

import java.io.Serializable;

public abstract class Person extends OrganizationComponent implements Serializable {
    protected Attribute attribute;

    public String GetId()
    {
        return attribute.getPersonId();
    }

    public String GetSex()
    {
        return attribute.getSex();
    }
    public String GetBirthTime()
    {
        return attribute.getBirthTime();
    }

    public double GetSalary()
    {
        return attribute.getSalary();
    }

    public void SetSalary(double salary)
    {
        attribute.setSalary(salary);
    }
    public void setBirthTime(String time){
        attribute.setBirthTime(time);
    }
    public void setSex(String sex){
        attribute.setSex(sex);
    }

    public Person(Attribute attribute)
    {
        super(attribute.getPersonId());
        this.attribute = attribute;
        System.out.println("======== 使用私有数据设计模式生成了一个人 ========");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void print() {
        System.out.println("+++++++++++"+getName()+"+++++++++++");
    }

}
