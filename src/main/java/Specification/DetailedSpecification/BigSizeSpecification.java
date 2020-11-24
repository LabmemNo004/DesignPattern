package Specification.DetailedSpecification;
import Chocolate.*;
import Specification.*;
import Mould.*;

public class BigSizeSpecification extends CompositeSpecification {
    @Override
    public boolean isSatisfiedBy(Object params) {
        Chocolate chocolate=(Chocolate) params;
        if(chocolate.getSize().toString()=="big")
        {
            return true;
        }
        return false;
    }
}
