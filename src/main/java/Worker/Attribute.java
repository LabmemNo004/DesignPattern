package Worker;

import FactoryParameter.*;
import Mould.BigMould;

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
    public void setBirthTime(String time){
        BirthTime=time;
    }
    public void setSex(String sex){
        Sex=sex;
    }

    public Parameter.WorkType getWorkType(){
        return this._type;
    }
    public void setType(Parameter.WorkType type) {this._type = type;}
    private String PersonId;
    private String BirthTime;
    private String Sex;
    private double Salary;
    private Parameter.WorkType _type;

    public Attribute(String personId, String birthTime, String sex, double salary) {
        PersonId = personId;
        BirthTime = birthTime;
        Sex = sex;
        Salary = salary;
    }
}
