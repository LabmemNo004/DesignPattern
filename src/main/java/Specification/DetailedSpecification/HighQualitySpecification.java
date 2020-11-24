package Specification.DetailedSpecification;
import Chocolate.*;
import Specification.*;
public class HighQualitySpecification extends CompositeSpecification{
    @Override
    public boolean isSatisfiedBy(Object params)
    {
        Chocolate chocolate=(Chocolate) params;
        if(chocolate.getQuality()>0)
        {
            return true;
        }
        return false;
    }
}
