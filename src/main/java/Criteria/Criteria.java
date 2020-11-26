package Criteria;

import java.io.Serializable;
import java.util.List;
import Chocolate.IChocolate;

public interface Criteria extends Serializable {
    //过滤巧克力
    public List<IChocolate> meetCriteria(List<IChocolate> chocolates);
}
