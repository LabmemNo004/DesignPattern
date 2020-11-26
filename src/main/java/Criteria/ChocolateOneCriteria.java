package Criteria;

import java.util.List;
import java.util.ArrayList;
import Chocolate.IChocolate;

public class ChocolateOneCriteria implements Criteria{
    @Override
    public List<IChocolate> meetCriteria(List<IChocolate> chocolates) {
        List<IChocolate> qualifiedChocolates = new ArrayList<>();
        for(IChocolate chocolate:chocolates){
            if(chocolate.getQuality() == 1){
                qualifiedChocolates.add(chocolate);
            }
        }
        return chocolates;
    }    
}
