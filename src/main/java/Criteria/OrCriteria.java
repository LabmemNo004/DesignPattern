package Criteria;

import java.util.List;

import Chocolate.Chocolate;

public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Chocolate> meetCriteria(List<Chocolate> chocolates) {
        System.out.println("使用过滤器模式筛选质量系数为0和1的巧克力");
        List<Chocolate> firstCriteriaChocolates = criteria.meetCriteria(chocolates);
        List<Chocolate> otherCriteriaChocolates = otherCriteria.meetCriteria(chocolates);

        for(Chocolate chocolate:otherCriteriaChocolates){
            if(!firstCriteriaChocolates.contains(chocolate)){
                firstCriteriaChocolates.add(chocolate);
            }
        }
        return firstCriteriaChocolates;
    }
}
