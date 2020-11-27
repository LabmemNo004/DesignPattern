package Specification;

public class NotSpecification extends CompositeSpecification{
    private final Specification a;

    public NotSpecification(Specification a) {
        this.a = a;
    }

    @Override
    public boolean isSatisfiedBy(Object params) {
        return !a.isSatisfiedBy(params);
    }
}
