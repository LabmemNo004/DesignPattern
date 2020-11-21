package Builder;
import FactoryParameter.Parameter;

public class PowderToLiquidWorkerBuilder {
    public PowderToLiquidWorkerBuilder() {
        System.out.println("成功创建液化巧克力工人的Builder");
    }
    public void setWorkType() {
        this._worker.setType(Parameter.WorkType.PACKAGING);
    }
    public void assignSpeed() { this._worker.setSpeed(Parameter.Speed.PACKAGING);}
}
