package Criteria;

import java.util.ArrayList;
import java.util.List;
import Chocolate.IChocolate;

public class ChocolateZeroCriteria implements Criteria{
    @Override
    public List<IChocolate> meetCriteria(List<IChocolate> chocolates) {
        List<IChocolate> qualifiedChocolates = new ArrayList<>();
        for(IChocolate chocolate:chocolates){
            if(chocolate.getQuality() == 0){
                qualifiedChocolates.add(chocolate);
            }
        }
        return chocolates;
    }
}
