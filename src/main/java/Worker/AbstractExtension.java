package Worker;

import java.io.Serializable;

public abstract class AbstractExtension extends Extension implements Serializable {

    public AbstractExtension(Worker owner) {
        super(owner);
    }
}
