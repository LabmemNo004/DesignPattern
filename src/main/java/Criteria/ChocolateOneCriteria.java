package Criteria;

import java.util.List;
import java.util.ArrayList;

import Chocolate.Chocolate;

public class ChocolateOneCriteria implements Criteria{
    @Override
    public List<Chocolate> meetCriteria(List<Chocolate> chocolates) {
        List<Chocolate> qualifiedChocolates = new ArrayList<>();
        for(Chocolate chocolate:chocolates){
            if(chocolate.getQuality() == 1){
                qualifiedChocolates.add(chocolate);
            }
        }
        return chocolates;
    }    
}
