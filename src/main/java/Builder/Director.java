package Builder;

import Person.Worker;
//工人还没写？

public class Director {
    private WorkerBuilder _builder;


    public void setBuilder (WorkerBuilder builder) {
        this._builder = builder;
    }


    public Worker getFarmer() {
        return _builder.getWorker();
    }


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
        return "建造了一个从事" + result + "工作的工人.";
    }
}
