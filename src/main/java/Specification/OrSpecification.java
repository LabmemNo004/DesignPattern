package Specification;

public class OrSpecification extends CompositeSpecification{
    private final Specification a;
    private final Specification b;

    public OrSpecification(Specification a, Specification b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean isSatisfiedBy(Object params) {
        return a.isSatisfiedBy(params) || b.isSatisfiedBy(params);
    }
}
