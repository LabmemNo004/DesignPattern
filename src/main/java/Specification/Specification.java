package Specification;

import java.io.Serializable;

public interface Specification extends Serializable {
    boolean isSatisfiedBy(Object params);
    Specification and(Specification other);
    Specification or(Specification other);
    Specification not();
}
