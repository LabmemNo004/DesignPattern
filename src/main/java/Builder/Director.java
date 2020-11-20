package Builder;

import Person.Worker;
//工人还没写？

public class Director {
    private WorkerBuilder _builder;

    /**
     * Sets builder.
     * 设置Director具体使用的Builder类型
     *
     * @param builder the builder
     */
    public void setBuilder (WorkerBuilder builder) {
        this._builder = builder;
    }

    /**
     * Gets farmer.
     * 从Builder中取出农民
     *
     * @return the farmer
     */
    public Worker getFarmer() {
        return _builder.getWorker();
    }

    /**
     * Construct farmer.
     * 利用Builder模式建造一个工人。首先指定农民的工作类型，再根据工作类型为农民分配农具。
     */
    public void constructWorker() {
        _builder.createNewWorker();
        _builder.setWorkType();
        _builder.assignSpeed();
    }

    @Override
    public String toString() {
        String result = _builder.getWorker().getWorkTypeString();
        return "Build a farmer engaged in " + result + " work.";
    }

    public String toStringZh() {
        String result = _builder.getWorker().getWorkTypeStringZh();
        return "建造了一个从事" + result + "工作的农民.";
    }
}
