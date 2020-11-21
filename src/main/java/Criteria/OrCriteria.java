package Criteria;

import java.util.List;

import Chocolate.Chocolate;

public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria,Criteria othercCriteria){
        this.criteria = criteria;
        this.otherCriteria = othercCriteria;
    }

    @Override
    public List<Chocolate> meetCriteria(List<Chocolate> chocolates) {
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
