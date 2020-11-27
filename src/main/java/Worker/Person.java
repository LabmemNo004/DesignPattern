package Worker;

import OrganizationComponent.OrganizationComponent;

import java.io.Serializable;

public abstract class Person extends OrganizationComponent implements Serializable {
    protected Attribute attribute;

    protected String GetId()
    {
        return attribute.getPersonId();
    }

    protected String GetSex()
    {
        return attribute.getSex();
    }
    protected String GetBirthTime()
    {
        return attribute.getBirthTime();
    }

    protected Double GetSalary()
    {
        return attribute.getSalary();
    }

    protected void SetSalary(double salary)
    {
        attribute.setSalary(salary);
    }

    public Person(Attribute attribute)
    {
        super(attribute.getPersonId());
        this.attribute = attribute;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void print() {
        System.out.println("+++++++++++"+getName()+"+++++++++++");
    }

}
