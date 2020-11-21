package Builder;
import FactoryParameter.Parameter;

public class LiquidToSolidWorkerBuilder {
    public LiquidToSolidWorkerBuilder() {
        System.out.println("成功创建固化巧克力工人的Builder");
    }
    public void setWorkType() {
        this._worker.setType(Parameter.WorkType.MATERIAL);
    }
    public void assignSpeed() { this._worker.setSpeed(Parameter.Speed.MATERIAL);}
}
