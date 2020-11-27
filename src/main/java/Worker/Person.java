package Worker;

import java.io.Serializable;

public abstract class Person implements Serializable {
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

    public Person(Attribute attribute) {
        this.attribute = attribute;
    }
}
