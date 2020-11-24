package Specification;

public interface Specification {
    boolean isSatisfiedBy(Object params);
    Specification and(Specification other);
    Specification or(Specification other);
    Specification not();
}
