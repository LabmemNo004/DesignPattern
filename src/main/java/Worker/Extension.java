package Worker;

import java.io.Serializable;

public abstract class Extension implements Serializable {
    protected Worker owner;

    public Extension(Worker owner) {
        this.owner = owner;
    }
    public abstract void DoMore();
    public Worker getOwner()
    {
        return owner;
    }
}
