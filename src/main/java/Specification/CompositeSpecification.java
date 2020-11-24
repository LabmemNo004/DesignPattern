package Specification;

public abstract class CompositeSpecification implements Specification{
    @Override
    public Specification and(Specification other)
    {
        return new AndSpecification(this,other);
    }

    @Override
    public Specification not()
    {
        return new NotSpecification(this);
    }

    @Override
    public Specification or(Specification other)
    {
        return new OrSpecification(this,other);
    }




}
