package Worker;

import java.io.Serializable;

public class Attribute implements Serializable {
    public String getPersonId() {
        return PersonId;
    }

    public String getBirthTime() {
        return BirthTime;
    }

    public String getSex() {
        return Sex;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    private String PersonId;
    private String BirthTime;
    private String Sex;
    private double Salary;

    public Attribute(String personId, String birthTime, String sex, double salary) {
        PersonId = personId;
        BirthTime = birthTime;
        Sex = sex;
        Salary = salary;
    }
}
