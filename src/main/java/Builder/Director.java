package Builder;

import Worker.Worker;
import FactoryParameter.Parameter;

public class Director {
    private WorkerBuilder _builder;


    public void setBuilder (WorkerBuilder builder) {
        this._builder = builder;
    }


    public Worker getWorker() {
        return _builder.getWorker();
    }


    public void constructWorker() {
        _builder.createNewWorker();
        _builder.setWorkType();
        _builder.assignSpeed();
    }

    @Override
    public String toString() {
        Parameter.WorkType result = _builder.getWorker().getWorkType();
        String strResult;
        if(result== Parameter.WorkType.LTS){
            strResult="liquid to solid";
        }
        else if(result==Parameter.WorkType.PTL){
            strResult="powder to liquid";
        }
        else {
            strResult="free";
        }
        return "Build a farmer engaged in " + strResult + " work.";
    }

    public String toStringZh() {
        Parameter.WorkType result = _builder.getWorker().getWorkType();
        String strResult;
        if(result== Parameter.WorkType.LTS){
            strResult="液态转固态";
        }
        else if(result==Parameter.WorkType.PTL){
            strResult="粉质转液态";
        }
        else {
            strResult="空闲";
        }
        return "建造了一个从事" + strResult + "工作的工人.";
    }
}
