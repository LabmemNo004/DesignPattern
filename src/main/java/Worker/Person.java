package Worker;

import java.io.Serializable;

public abstract class Person implements Serializable {
    protected Attribute attribute;

    public String getId()
    {
        return attribute.getPersonId();
    }

    protected String getSex()
    {
        return attribute.getSex();
    }
    protected String getBirthTime()
    {
        return attribute.getBirthTime();
    }

    protected Double getSalary()
    {
        return attribute.getSalary();
    }

    protected void setSalary(double salary)
    {
        attribute.setSalary(salary);
    }



    public Person(Attribute attribute) {

        this.attribute = attribute;
        System.out.println("使用私有数据模式完成了一次工人的创建");
    }
}
