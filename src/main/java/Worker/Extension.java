package Worker;

public abstract class Extension {
    protected Worker owner;

    public Extension(Worker owner) {
        this.owner = owner;
    }
    public abstract void DoSomething();
}
