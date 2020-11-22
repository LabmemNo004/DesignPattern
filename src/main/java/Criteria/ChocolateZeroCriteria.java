package Criteria;

import java.util.ArrayList;
import java.util.List;

import Chocolate.Chocolate;

public class ChocolateZeroCriteria implements Criteria{
    @Override
    public List<Chocolate> meetCriteria(List<Chocolate> chocolates) {
        List<Chocolate> qualifiedChocolates = new ArrayList<>();
        for(Chocolate chocolate:chocolates){
            if(chocolate.getQuality() == 0){
                qualifiedChocolates.add(chocolate);
            }
        }
        return chocolates;
    }
}
