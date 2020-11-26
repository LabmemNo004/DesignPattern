package Criteria;

import java.util.List;
import Chocolate.IChocolate;

public interface Criteria {
    //过滤巧克力
    public List<IChocolate> meetCriteria(List<IChocolate> chocolates);
}
